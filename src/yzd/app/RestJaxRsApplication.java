package yzd.app;


import org.restlet.Context;
import org.restlet.ext.jaxrs.JaxRsApplication;
/***
 * 
 * @author Steven
 * http://www.lifeba.org
 */
public class RestJaxRsApplication extends JaxRsApplication {

	//构造方法
	public RestJaxRsApplication(Context context) {
        super(context);
		//测试冲突
		//呵呵
        this.add(new StudentApplication());
    }
	
}
