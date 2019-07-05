package com.auxo.pradeep.Db.Mapper;

import com.auxo.pradeep.model.Department;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class DepartmentMapper implements ResultSetMapper<Department> {


    public Department map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {

        Department department = new Department(


                resultSet.getInt("dptid"),

                resultSet.getString("dptname")

        );

        return department;

    }

}
