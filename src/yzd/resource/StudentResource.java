package yzd.resource;


import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.restlet.data.Form;
import org.restlet.representation.Representation;

import yzd.model.PutRequest;
import yzd.model.Student;

/***
 * 
 * @author Steven
 * http://www.lifeba.org
 */
@Path("student")
public class StudentResource {
	
	 @GET
     @Path("{id}/json")
     @Produces("application/json") 
     public Student getStudentJson(@PathParam("id") int id) { 
		 return ResourceHelper.findStudent(id);
     }
	 
	 @GET
	 @Path("json")
	 @Produces("application/json") 
	 public Student getStudentJson1(@QueryParam("id") int id) { 
		 return ResourceHelper.findStudent(id);
	 }
	 
	 @POST
	 @Path("add")
     public String addStudent(Representation entity) {
		 Form form = new Form(entity);
		 String name = form.getFirstValue("name");
		 int clsId = Integer.parseInt(form.getFirstValue("clsId"));
		 int sex = Integer.parseInt(form.getFirstValue("sex"));
		 Student student = new Student();
		 student.setClsId(clsId);
		 student.setName(name);
		 student.setSex(sex);
		 ResourceHelper.maxId++;
		 int id =  ResourceHelper.maxId;
		 student.setId(id);
		 return String.valueOf(ResourceHelper.addStudent(student));
     }
	 
	 @PUT
	 @Path("update")
     public String updateStudent(Representation entity) {
		 Form form = new Form(entity);
 
		 int id = Integer.parseInt(form.getFirstValue("id")); 
		 Student student = ResourceHelper.findStudent(id);
		 
		 String name = form.getFirstValue("name");
		 int clsId = Integer.parseInt(form.getFirstValue("clsId"));
		 int sex = Integer.parseInt(form.getFirstValue("sex"));
		 
		 student.setClsId(clsId);
		 student.setName(name);
		 student.setSex(sex);
		 
		 return String.valueOf(ResourceHelper.updateStudent(student));
     }
	 
	 @DELETE
	 @Path("delete/{id}")
     public String deleteStudent(@PathParam("id") int id) {
		 int status = ResourceHelper.deleteStudent(id);
		 return String.valueOf(status);
     }
	 
	 @PUT
	 @Consumes({MediaType.APPLICATION_JSON})
	 @Produces({MediaType.APPLICATION_JSON})
	 @Path("put/")
	 public Set<PutRequest> deleteStudents(Set<PutRequest> req) {
		 
		return req;
	 }
	
}
