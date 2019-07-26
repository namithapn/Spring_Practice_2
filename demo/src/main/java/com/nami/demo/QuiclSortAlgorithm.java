package com.nami.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuiclSortAlgorithm implements SortAlgorithm{

	
	public int[] sort(int[] numbers ){
		//logic of quick sort 
		return numbers;
	}
	
}
