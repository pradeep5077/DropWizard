package com.auxo.pradeep.Db.Mapper.DAO;

import com.auxo.pradeep.Db.Mapper.EmployeeMapper;
import com.auxo.pradeep.model.Employee;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

@RegisterMapper(EmployeeMapper.class)
public interface EmployeeDAO {
    @SqlQuery("select * from `employee` ")
    public List<Employee> getEmployee();


    @SqlQuery("select * from `employee` where id= :id")
    public Employee getEmploye(@Bind("id") final int id);

    @SqlUpdate("INSERT INTO `employee` (`id`,`name`,`age`,`place`,`dob`,`phone`,`deptid`) VALUES (:id , :name, :age, :place, :dob, :phone, :deptid );")

    public void insert(@BindBean Employee employee);



    @SqlUpdate("update employee set name = coalesce(:name ,name) where id= :id")

    void editEmploye(@BindBean Employee employee);



    @SqlUpdate("delete from employee where id= :id")

    int deleteEmployee(@Bind("id")final int id);

}
