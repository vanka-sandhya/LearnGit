package com.in26minutes.spring.frame.work.enterprise.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;





@Component
public class DataService
{
	public List<Integer> retriveData()
	{
		
		return Arrays.asList(12,15,20,25,10);
		
	}
	
}
