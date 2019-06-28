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
}
