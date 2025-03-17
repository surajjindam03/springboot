package com.in28minutes.springboot.learn_spring_boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CurrencyConfigurationController {
	
	@Autowired
	private CurrencyServiceConfiguration currencyServiceConfiguration;
	
	
	
	@RequestMapping("/currency-configuration")
	public CurrencyServiceConfiguration retrieveAll(){
		return currencyServiceConfiguration;
	}

}
