package com.auxo.pradeep.Db.Mapper.DAO;

import com.auxo.pradeep.Db.Mapper.DepartmentMapper;
import com.auxo.pradeep.model.Department;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

@RegisterMapper(DepartmentMapper.class)

public interface DepartmentDAO {


    @SqlQuery("select * from `department`")
    List<Department> getDepartment();
    @SqlQuery(value = "select * from `department` where dptid= :dptid")
    public Department getDepartment1(@Bind("dptid") final int dptid);


}