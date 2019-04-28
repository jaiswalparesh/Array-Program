package com.array.prac;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumber {
	
	public static void main(String args[]) {
		int intArr[] = {1,2,3,4,1,5};
		int intArr1[] = {1,2,3,4,1,5,2};
		int length = intArr.length;
		DuplicateNumber number = new DuplicateNumber();
		number.findSingleDuplicateNumber(intArr,length);
		System.out.println();
		number.findMultiDupilicateNumber(intArr1);
	}

	private void findMultiDupilicateNumber(int[] intArr) {
		Map<Integer,Integer> map = new HashMap<>();
		for (int i : intArr) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}else {
				map.put(i, 1);
			}
		}
		map.entrySet().stream().filter(entry -> entry.getValue() > 1).forEach(System.out::println);
	}

	private void findSingleDuplicateNumber(int intArr[], int length) {
		int result = sumOfArray(intArr) - (length*(length-1)/2);
		System.out.println(result);
	}

	private int sumOfArray(int[] intArr) {
		int sum = 0;
		for (int i : intArr) {
			sum = sum+i;
		}
		return sum;
	}

}
