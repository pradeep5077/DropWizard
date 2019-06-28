package com.auxo.pradeep;
import com.auxo.pradeep.Db.Mapper.DAO.EmployeeDAO;
import com.auxo.pradeep.Resource.EmployeeResources;
import com.auxo.pradeep.Service.EmployeeService;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Environment;
import org.skife.jdbi.v2.DBI;

public class DropWizardApplication extends Application<DropwWizardConfiguration> {
    public static void main(String[] args) throws Exception {
        new DropWizardApplication().run(args);
    }


    public void run(DropwWizardConfiguration dropwWizardConfiguration, Environment environment) throws Exception {
        final DBIFactory dbiFactory=new DBIFactory();
        final DBI dbi=dbiFactory.build(environment,dropwWizardConfiguration.getDataSourceFactory(),"mysql");
        final EmployeeDAO employeeDAO=dbi.onDemand(EmployeeDAO.class);
        final EmployeeService employeeService=new EmployeeService(employeeDAO);
        System.out.println("database connected");
        environment.jersey().register(new EmployeeResources(employeeService));
    }
}
