package kr.co.fdp.information.controller;

import org.springframework.beans.factory.annotation.Autowired;

import kr.co.fdp.information.service.InformationService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InformationController {
	
	@Autowired
	private InformationService service;
	
	@GetMapping(value="/projectInfo")
	public String projectInfo() {
		
		return service.getProjectInformation();
	}
}
