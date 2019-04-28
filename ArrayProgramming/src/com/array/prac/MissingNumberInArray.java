package com.array.prac;

import java.util.BitSet;

public class MissingNumberInArray {

	public static void main (String args[]) {
		int intArr[] = {1,2,4,5,6};
		int intArr1[] = {1,2,4,6};
		
		MissingNumberInArray missingNumber = new MissingNumberInArray();
		missingNumber.findSingleMissingNumber(intArr);
		System.out.println(" ");
		missingNumber.findMultipleMissingNumber(intArr1,2);
	}

	//Find the multiple missing number in an array.
	private void findMultipleMissingNumber(int[] intArr1, int count) {
		BitSet bit  = new BitSet(intArr1.length);
		int lastMissingIndex = 0;
		for (int i : intArr1) {
			bit.set(i-1);
		}
		for(int i = count; i>0; i--) {
			lastMissingIndex =bit.nextClearBit(lastMissingIndex);
			System.out.println(++lastMissingIndex);
		}
		
	}
	//Finds the single missing number in an array.
	private void findSingleMissingNumber(int[] intArr) {
		int arrSeq [] = new int[intArr.length];
		int intArrSum = 0;
		int arrSeqSum = 0;
		
		for(int i = 0; i< intArr.length; i++) {
			intArrSum = intArrSum + intArr[i];
		}
		
		for (int i = 0; i < arrSeq.length; i++) {
			arrSeq[i] = i+1;
		}
		
		for(int i = 0; i < arrSeq.length; i++) {
			arrSeqSum = arrSeqSum + arrSeq[i];
		}
		
		System.out.println(intArrSum - arrSeqSum);
	}
}
