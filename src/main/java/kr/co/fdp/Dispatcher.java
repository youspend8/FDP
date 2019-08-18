package kr.co.fdp;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jdom2.Document;
import org.jdom2.input.SAXBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@Configuration
public class Dispatcher extends DispatcherServlet {
	private static final long serialVersionUID = 1L;

	private static Document microServiceInform = null;
	private static Properties globalProps = null;
	
	static {
		ClassLoader classLoader = Dispatcher.class.getClassLoader();
		
		try (InputStream globalPropsIs = new BufferedInputStream(new FileInputStream(System.getenv(Global.getSystemEnvName())));
			 InputStream msInformationIs = new BufferedInputStream(new FileInputStream(
						classLoader.getResource("kr/co/fdp/microServiceInformation.xml").getFile()))) {
			
			SAXBuilder builder = new SAXBuilder();

			microServiceInform = builder.build(msInformationIs);
			
			globalProps = new Properties();
			globalProps.load(globalPropsIs);
			globalProps.entrySet().forEach(prop -> {
				Global.put(prop.getKey().toString(), prop.getValue());
				System.out.println("[Global] " + prop.getKey() + " :: " + prop.getValue());
			});
			
		} catch (Exception e) {
			System.err.println("Global Properties Initilizing Failed");
		}
	}
	
	public static Document getMicroServiceInform() {
		return microServiceInform;
	}

	public static void setMicroServiceInform(Document microServiceInform) {
		Dispatcher.microServiceInform = microServiceInform;
	}

	public Dispatcher() {
		super();
	}

	public Dispatcher(WebApplicationContext webApplicationContext) {
		super(webApplicationContext);
	}

	@Override
	protected void onRefresh(ApplicationContext context) {
		super.onRefresh(context);
	}

	@Override
	protected void doService(HttpServletRequest request, HttpServletResponse response) throws Exception {
		super.doService(request, response);
	}

	@Override
	protected void doDispatch(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("Request-URI :: " + request.getRequestURI());
		System.out.println("Content-Type :: " + request.getContentType());
		System.out.println("SESSION :: " + request.getSession().getCreationTime());
		super.doDispatch(request, response);
	}

}
