package com.lds.Ubudad4_prueba_junit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */

public class App {
	
	private static Logger log = LoggerFactory.getLogger(App.class);
	
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}

	public static int suma(int a, int b) {
		log.info("sumando a+ b" );
		return a + b;
	}
	
	

}
