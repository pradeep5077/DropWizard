package com.auxo.pradeep.Service;

import com.auxo.pradeep.Db.Mapper.DAO.EmployeeDAO;
import com.auxo.pradeep.model.Employee;

import java.util.List;

public class EmployeeService {

    private EmployeeDAO employeeDAO;
    public EmployeeService(final EmployeeDAO employeeDAO)
    {
        this.employeeDAO=employeeDAO;
    }
    public List<Employee> getEmployee()
    {
        return this.employeeDAO.getEmployee();
    }
    public Employee getEmploye(final int id)

    {
        System.out.println("id is "+id);
        return this.employeeDAO.getEmploye(id);
    }
    public void insert(Employee employee)

    {


        this.employeeDAO.insert(employee);



    }

    public Employee editEmploye(Employee employee)

    {

        this.employeeDAO.editEmploye(employee);

        return this.employeeDAO.getEmploye(Integer.parseInt(String.valueOf(employee.getId())));

    }

    public int deleteEmployee(int id)

    {

        return this.employeeDAO.deleteEmployee(id);

    }
}
