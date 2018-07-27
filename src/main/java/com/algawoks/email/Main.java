package com.algawoks.email;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class.getPackage().getName()); 
		
		
		applicationContext.close();
		
		System.out.println("Fim");
	}

}
