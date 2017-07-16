package yzd.app;


import org.restlet.Context;
import org.restlet.ext.jaxrs.JaxRsApplication;
/***
 * 
 * @author Steven
 * http://www.lifeba.org
 */
public class RestJaxRsApplication extends JaxRsApplication {
	//构造子
	//RestJaxRsApplication
	public RestJaxRsApplication(Context context) {
        super(context);
        this.add(new StudentApplication());
    }
}
