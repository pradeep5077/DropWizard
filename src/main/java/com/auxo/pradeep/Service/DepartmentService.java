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
    public Department getDepartment1(final int dptid){
        System.out.println("dptid is "+dptid);
        return this.departmentDAO.getDepartment1(dptid);


    }

}


