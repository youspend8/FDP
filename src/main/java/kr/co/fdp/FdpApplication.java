package kr.co.fdp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class FdpApplication extends SpringBootServletInitializer {
	
	private static final Logger logger = LoggerFactory.getLogger(FdpApplication.class);
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		Global.init();
		return builder.sources(FdpApplication.class);
	}

	public static void main(String[] args) {
		Global.init();
		SpringApplication.run(FdpApplication.class, args);
	}

}
