package com.ust.iocautowiring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;

public class B {
	A a;
	
	
	/*
	 * public B(A a) { this.a=a; System.out.println("constructor"); }
	 */
	
	@Qualifier("a")
	public void setA(A a) {
		//by name and bytype will use setter injection
		System.out.println("setA() called");
		this.a=a;
	}
	@PostConstruct
	public void setUp()
	{
		System.out.println("from setUp()..");
		
	}
	@PreDestroy
	public void windup()
	{
		System.out.println("from windup()...");
	}


	public B() {
		super();
	}

}
