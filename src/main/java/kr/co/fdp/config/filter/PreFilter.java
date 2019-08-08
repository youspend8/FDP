package kr.co.fdp.config.filter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;

import com.google.common.net.HttpHeaders;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class PreFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}
	

	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest req = ctx.getRequest();
		
		String authorHeader = req.getHeader(HttpHeaders.AUTHORIZATION);
		if (!validateToken(authorHeader)) {
			ctx.setSendZuulResponse(false);
			ctx.setResponseBody("THIS API KEY DO NOT AUTHORIZED");
			ctx.getResponse().setHeader("Content-Type", "text/plain;charset=UTF-8");
			ctx.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
		}
		return null;
	}
	
	private boolean validateToken(String tokenHeader) {
		
		return true;
	}
}
