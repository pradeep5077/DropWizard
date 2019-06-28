package com.auxo.pradeep.Resource;


import com.auxo.pradeep.Service.EmployeeService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api/employee")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeResources {
    private EmployeeService employeeService;
    public EmployeeResources(final EmployeeService employeeSevice)
    {
        this.employeeService=employeeSevice;
    }

    @GET
    public Response getEmployee()
    {
        return Response.ok().entity(this.employeeService.getEmployee()).build();
    }

    @GET
    @Path("/{id}")
    public  Response getEmploye(@PathParam("id")final int id)
    {
        System.out.println("id is "+id);
        return Response.ok().entity(this.employeeService.getEmploye(id)).build();
    }
}
