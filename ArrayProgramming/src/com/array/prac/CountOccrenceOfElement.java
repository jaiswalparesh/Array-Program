package com.array.prac;

import java.util.HashMap;
import java.util.Map;

public class CountOccrenceOfElement {
	public static void main(String[] args) {
		int arr [] = {2,7,5,4,2,6,8,5};
		
		CountOccrenceOfElement element = new CountOccrenceOfElement();
		element.countOccrenceOfElement(arr);
	}

	private void countOccrenceOfElement(int[] arr) {
		Map<Integer,Integer> map = new HashMap<>();
		
		for (int i : arr) {
			
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}
			else{
				map.put(i, 1);
			}
		}
		
		map.entrySet().stream().forEach(System.out :: println);
	}
}
