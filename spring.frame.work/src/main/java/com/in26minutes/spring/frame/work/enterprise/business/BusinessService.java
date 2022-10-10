package com.in26minutes.spring.frame.work.enterprise.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.in26minutes.spring.frame.work.enterprise.data.DataService;




@Component
public class BusinessService
{
	@Autowired
	private DataService dataDervice;
	public long calculateSum()
	{
		return dataDervice.retriveData().stream().reduce(Integer::sum).get();
	}
	
}

