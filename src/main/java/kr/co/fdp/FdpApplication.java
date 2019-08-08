package kr.co.fdp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FdpApplication extends SpringBootServletInitializer {
	
	private static final Logger logger = LoggerFactory.getLogger(FdpApplication.class);

	@Bean
	public ServletRegistrationBean<Dispatcher> test(Dispatcher dispatcher) {
		ServletRegistrationBean<Dispatcher> servlet = new ServletRegistrationBean<>(dispatcher);
		servlet.addUrlMappings("/");
		return servlet;
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(FdpApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(FdpApplication.class, args);
	}

}
