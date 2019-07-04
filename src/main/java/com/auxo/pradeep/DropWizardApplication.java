package com.auxo.pradeep;

import com.auxo.pradeep.Db.Mapper.DAO.DepartmentDAO;
import com.auxo.pradeep.Db.Mapper.DAO.EmployeeDAO;
import com.auxo.pradeep.Resource.DepartmentResource;
import com.auxo.pradeep.Resource.EmployeeResources;
import com.auxo.pradeep.Service.DepartmentService;
import com.auxo.pradeep.Service.EmployeeService;
import io.dropwizard.Application;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Environment;
import org.skife.jdbi.v2.DBI;

public class DropWizardApplication extends Application<DropwWizardConfiguration> {
    public static void main(String[] args) throws Exception {
        new DropWizardApplication().run(args);
    }


    public void run(DropwWizardConfiguration dropwWizardConfiguration, Environment environment) throws Exception {
        final DBIFactory dbiFactory = new DBIFactory();
        final DBI dbi = dbiFactory.build(environment, dropwWizardConfiguration.getDataSourceFactory(), "mysql");
        final EmployeeDAO employeeDAO = dbi.onDemand(EmployeeDAO.class);
        final EmployeeService employeeService = new EmployeeService(employeeDAO);
        System.out.println("database connected");
        environment.jersey().register(new EmployeeResources(employeeService));
        final DepartmentDAO departmentDAO = dbi.onDemand(DepartmentDAO.class);

        final DepartmentService departmentService = new DepartmentService(departmentDAO);


        final DepartmentResource.DepartmentResources departmentResources = new DepartmentResource.DepartmentResources(departmentService);
        System.out.println("department added");

        environment.jersey().register(departmentResources);
    }
}
