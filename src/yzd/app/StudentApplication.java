package yzd.app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import yzd.resource.StudentResource;

/***
 * 	
 * @author Steven
 * http://www.lifeba.org
 */
public class StudentApplication extends Application {


	@Override
	public Set<Class<?>> getClasses() 
	{
		Set<Class<?>> rrcs = new HashSet<Class<?>>();
        rrcs.add(StudentResource.class);
        return rrcs;
	}

}
