package com.array.prac;

import java.util.HashSet;
import java.util.Set;

public class FindPairOfGivenSum {
	public static void main(String[] args) {
		int arr [] = {4,6,5,-10,8,5,20};
		int sum  = 10;
		
		FindPairOfGivenSum pair = new FindPairOfGivenSum();
		pair.pairOfGivenSum(arr, sum);
	}

	//o(n)
	private void pairOfGivenSum(int[] arr, int sum) {
		Set<Integer> set = new HashSet<>();
		int result = 0;
		
		for (int i : arr) {
			result = sum - i;
			if(set.contains(result)) {
				System.out.println("pair value is (" + i + "," + result +")");
			}else {
				set.add(i);
			}
		}
		
	}
}
