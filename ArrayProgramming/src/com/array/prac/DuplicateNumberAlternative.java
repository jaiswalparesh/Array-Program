package com.array.prac;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumberAlternative {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,2,5,1,5};
		//o(n*n)
		for(int i= 0 ; i< arr.length; i++) {
			for(int j = i+1; j< arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
		DuplicateNumberAlternative alternative = new DuplicateNumberAlternative();
		alternative.findDuplicate(arr);
	}
	
	//Alternative form 
	public void findDuplicate (int arr[]) {
		Set<Integer> set  = new HashSet<>();
		for (int i : arr) {
			if(!set.add(i)) {
				System.out.println("Duplicate value is : " + i);
			}
	 	}
	}//o(n)
}


