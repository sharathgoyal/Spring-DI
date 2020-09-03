package com.spring.di.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.di.demo.domain.State;

public class SpringDISetter {
	
	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContextSetter.xml");
		
		State stateObj = (State) appContext.getBean("stateBean");
		
		String stateName = stateObj.getStateName();
		String cityName = stateObj.getCity().getCityName();
		System.out.println(cityName + " is a city in " +stateName+ " state.");
	}
}
