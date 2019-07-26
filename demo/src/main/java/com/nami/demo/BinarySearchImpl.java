package com.nami.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	/*public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}*/

// no need of constructor or setter 
	/*public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}*/

	public int binarySearch(int[] numbers, int numberToSearchFor){
		// tight coupling 
		//implement sorting logic
		//bubble sort algorithm 
		//BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		int[] bubbleSortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		//switch to quick sort 
		// search the array 
		
		return 3;
	}
}
