package com.array.prac;

public class ArrayRotation {
	public static void main(String[] args) {
		int arr [] = {5,3,1,8,9};
		int rot = 2;
		ArrayRotation rotation = new ArrayRotation();
		rotation.rotateArray(arr,rot);
	}

	private void rotateArray(int[] arr, int rot) {
		int gcd = gcd(arr.length,rot);
		int i,j,k,temp;
		
		for(i = 0; i< gcd; i++) {
			temp = arr[i];
			j=i;
			while(true) {
				k = j+rot;
				if(k>= arr.length) {
					k = k-arr.length;
				}
				if(k== i) {
					break;
				}
				arr[j] = arr[k];
				j=k;
			}
			arr[j] = temp;
		}
		
		for (int l : arr) {
			System.out.println(l);
		}
	}

	private int gcd(int size, int rot) {
		if (size == 0) {
			return rot;
		}
		return gcd(rot%size, size);
	}
}
