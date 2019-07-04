package com.auxo.pradeep.Resource;

import com.auxo.pradeep.Service.DepartmentService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class DepartmentResource {
    @Path("/api/department")

    @Produces(MediaType.APPLICATION_JSON)

    @Consumes(MediaType.APPLICATION_JSON)

    public static class DepartmentResources {


        private DepartmentService departmentService;


        public DepartmentResources(final DepartmentService departmentService) {

            this.departmentService = departmentService;

        }

        @GET

        public Response getDepartment() {


            return Response.ok().entity(this.departmentService.getDepartment()).build();

        }
        @GET
        @Path("/{dept_id}")
        public  Response getDepartment1(@PathParam("dept_id")final int dept_id)
        {
            System.out.println("dept_id is "+dept_id);
            return Response.ok().entity(this.departmentService.getDepartment1(dept_id)).build();
        }

    }
}
