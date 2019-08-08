package kr.co.fdp.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;

public class CustomErrorController implements ErrorController {
	private static final String ERROR_PATH = "/error";

	@Override
	public String getErrorPath() {
		return ERROR_PATH;
	}
	
	@RequestMapping(value=ERROR_PATH)
	public Map<String, String> handleError(HttpServletRequest req, HttpServletResponse resp) {
		Object status = req.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
		HttpStatus httpStatus = HttpStatus.valueOf(Integer.valueOf(status.toString()));
		Map<String, String> errorMsg = new HashMap<>();
		errorMsg.put("code", status.toString());
		errorMsg.put("msg", httpStatus.getReasonPhrase());
		return errorMsg;
	}
	
}
