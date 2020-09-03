package com.spring.di.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.di.demo.domain.Capital;
import com.spring.di.demo.domain.Country;

public class SpringDIConstructor {
	
	public static void main(String[] args) {
		
		//System.out.println("args "+args[0]);
		//First step to load app-config or bean config details
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//It will load the country object and also
		//it will load capital object by using the reg tag name
		Country countryObj = (Country) appContext.getBean("countryBean");
		
		//******************************//
		String countryName = countryObj.getCountryName();
		String capitalName = countryObj.getCapital().getCapitalName();
		System.out.println(capitalName + " is the capital of "+ countryName);
		
		//Manual:
		Capital d = new Capital();
		Country country = new Country("String", d);
		String ddd = country.getCountryName();
		Capital c = country.getCapital();
		String capitName = c.getCapitalName();
		
		
	}

}
