package kr.co.fdp;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@Configuration
public class Dispatcher extends DispatcherServlet {
	private static final long serialVersionUID = 1L;

	static {
		Properties properties = new Properties();
		try (InputStream is = new FileInputStream("C:/system.properties")) {
			properties.load(is);
			properties.entrySet().forEach(prop -> {
				Global.put(prop.getKey().toString(), prop.getValue());
				System.out.println("[Global] " + prop.getKey() + " :: " + prop.getValue());
			});
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Global Properties Initilizing Failed");
		}
	}
	
	public Dispatcher() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Dispatcher(WebApplicationContext webApplicationContext) {
		// TODO Auto-generated constructor stub
		super(webApplicationContext);
	}

	@Override
	protected void onRefresh(ApplicationContext context) {
		// TODO Auto-generated method stub
		super.onRefresh(context);
	}

	@Override
	protected void doService(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		super.doService(request, response);
	}

	@Override
	protected void doDispatch(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(request.getSession().getCreationTime());
		super.doDispatch(request, response);
	}

}
