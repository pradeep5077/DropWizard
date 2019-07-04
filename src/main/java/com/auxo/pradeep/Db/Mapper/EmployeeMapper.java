package com.auxo.pradeep.Db.Mapper;

import com.auxo.pradeep.model.Employee;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper  implements ResultSetMapper<Employee> {
    public Employee map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
        Employee employee=new Employee(
                resultSet.getInt("id"),
                resultSet.getString("name"),
                resultSet.getString("phone"),
                resultSet.getString("dob"),
                resultSet.getInt("deptid")
        );
        return  employee;
    }
}
