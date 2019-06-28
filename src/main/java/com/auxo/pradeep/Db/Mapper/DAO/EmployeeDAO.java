package com.auxo.pradeep.Db.Mapper.DAO;

import com.auxo.pradeep.Db.Mapper.EmployeeMapper;
import com.auxo.pradeep.model.Employee;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

@RegisterMapper(EmployeeMapper.class)
public interface EmployeeDAO {
    @SqlQuery("select * from `employee` ")
    public List<Employee> getEmployee();


    @SqlQuery("select * from `employee` where id= :id")
    public Employee getEmploye(@Bind("id") final int id);

}
