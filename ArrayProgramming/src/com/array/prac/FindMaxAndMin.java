package com.array.prac;

public class FindMaxAndMin {
	public static void main(String[] args) {
		//int intArr[] = { 1, 6, 9, 10, 2 };
		int intArr[] = {1,-1,0};

		FindMaxAndMin maxAndMin = new FindMaxAndMin();
		maxAndMin.findMaxAndMin(intArr);

	}

	private void findMaxAndMin(int[] intArr) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i : intArr) {
			if (i > max) {
				max = i;	
			} else if (i < min) {
				min = i;
			}
		}
		System.out.println("Max value: " + max + " and min value: " + min);
	}
}
/*int largest = Integer.MIN_VALUE; 
int smallest = Integer.MAX_VALUE; 
for (int number : numbers) 
{ if (number > largest)
{ largest = number; } 
else if (number < smallest) 
{ smallest = number; } 
}

Read more: http://www.java67.com/2014/02/how-to-find-largest-and-smallest-number-array-in-java.html#ixzz5lju9bjKx*/