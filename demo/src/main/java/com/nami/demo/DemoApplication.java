package com.nami.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
	ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
	BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int [] {12,4, 6} , 3);
		System.out.println(result);
		//com.nami.demo.BubbleSortAlgorithm@27508c5d
		//3

		
		
	}

}
