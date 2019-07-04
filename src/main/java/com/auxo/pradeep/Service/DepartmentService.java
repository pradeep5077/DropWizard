package com.auxo.pradeep.Service;

import com.auxo.pradeep.Db.Mapper.DAO.DepartmentDAO;
import com.auxo.pradeep.model.Department;

import java.util.List;

public class DepartmentService {


    private DepartmentDAO departmentDAO;

    public DepartmentService(final DepartmentDAO departmentDAO) {

        this.departmentDAO = departmentDAO;

    }


    public List<Department> getDepartment() {

        return this.departmentDAO.getDepartment();}
    public Department getDepartment1(final int dept_id){
        System.out.println("dept_id is "+dept_id);
        return this.departmentDAO.getDepartment1(dept_id);

    }

}


