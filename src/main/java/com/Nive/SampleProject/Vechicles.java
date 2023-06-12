package com.Nive.SampleProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vechicles {
	@Autowired
	private Car car;
	public void display() {
		System.out.println("hi");
		car.run();
	}
	
}
