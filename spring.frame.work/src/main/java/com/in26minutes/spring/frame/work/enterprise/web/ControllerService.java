package com.in26minutes.spring.frame.work.enterprise.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in26minutes.spring.frame.work.enterprise.business.BusinessService;



@RestController

public class ControllerService
{
@Autowired	
private	BusinessService businessService;
	@GetMapping("/Sum")
	public long displaySum()
	{
		return businessService.calculateSum();
	}
	
}