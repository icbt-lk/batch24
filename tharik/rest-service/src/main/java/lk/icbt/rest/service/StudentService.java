/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lk.icbt.rest.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author tharik
 */
@Path("student")
public class StudentService {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getStudents() {
        DBUtils utils = new DBUtils();
        Gson gson = new GsonBuilder().create();
        return gson.toJson(utils.getStudents());
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getStudent(@PathParam("id") String id) {
        DBUtils utils = new DBUtils();
        Gson gson = new GsonBuilder().create();
        return gson.toJson(utils.getStudent(id));
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addStudent(String json) {
        DBUtils utils = new DBUtils();
        Gson gson = new GsonBuilder().create();
        Student student = gson.fromJson(json, Student.class);
        boolean result = utils.addStudent(student);
        
        if (result) {
            return Response.status(201).entity("Successfully added").build();
        } else {
            return Response.status(501).entity("Error occurred").build();
        }
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateStudent(String json) {
        DBUtils utils = new DBUtils();
        Gson gson = new GsonBuilder().create();
        Student student = gson.fromJson(json, Student.class);
        boolean result = utils.updateStudent(student);
        
        if (result) {
            return Response.status(200).entity("Successfully updated").build();
        } else {
            return Response.status(501).entity("Error occurred").build();
        }
    }
    
    @DELETE
    @Path("/{id}")
    public Response deleteStudent(@PathParam("id") String id) {
        DBUtils utils = new DBUtils();
        boolean result = utils.deleteStudent(id);
        if (result) {
            return Response.status(200).entity("Successfully deleted").build();
        } else {
            return Response.status(501).entity("Error occurred").build();
        }
    }
}
