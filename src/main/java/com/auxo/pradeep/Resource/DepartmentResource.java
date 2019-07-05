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
        @Path("/{dptid}")
        public  Response getDepartment1(@PathParam("dptid")final int dptid)
        {
            System.out.println("dptid is "+dptid);
            return Response.ok().entity(this.departmentService.getDepartment1(dptid)).build();
        }

    }
}
