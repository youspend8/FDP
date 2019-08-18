package kr.co.fdp.config;

import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.fdp.config.filter.ErrorFilter;
import kr.co.fdp.config.filter.PostFilter;
import kr.co.fdp.config.filter.PreFilter;
import kr.co.fdp.config.filter.RouteFilter;

@Configuration
@EnableZuulProxy
public class ZuulProxyConfig {
	
	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}

	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}

	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}

	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}

}
