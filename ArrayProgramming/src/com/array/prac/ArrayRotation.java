/*Rotate an Array in any given direction by k step

For Right Rotation by k steps:
Reverse the entire array
Reverse the first k elements
Reverse the remaining n - k elements

For Left Rotation by k steps:
Reverse the first k elements
Reverse the remaining n - k elements
Reverse the entire array

Normalize k by doing k = k % N
If direction is "right":
Reverse the entire array
Reverse the first k elements
Reverse the rest (from k to end)

If direction is "left":
Reverse the first k elements
Reverse the rest (from k to end)
Reverse the entire array

ref link: https://takeuforward.org/data-structure/rotate-array-by-k-elements
*/

public class ArrayRotation {

	public static void main(String[] arg) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		//left o/p:3 4 5 6 7 1 2 
		//right o/p:6 7 1 2 3 4 5
		int rotStep = 2;
		String direction = "left";// "right";
		rotateArray(arr, rotStep, direction);
	}

	private static void rotateArray(int arr[], int rotStep, String dir) {
		int size = arr.length - 1;
		//Normalize k by doing k = k % N
		int k = rotStep % size;
		if (dir.equals("right")) {
			//Reverse the entire array
			reverseAllArray(arr, 0, size);
			//Reverse the first k elements
			reverseAllArray(arr, 0, k - 1);
			//Reverse the rest (from k to end)
			reverseAllArray(arr, k, size);
		}
		if (dir.equals("left")) {
			//Reverse the first k elements
			reverseAllArray(arr, 0, k - 1);
			//Reverse the rest (from k to end)
			reverseAllArray(arr, k, size);
			//Reverse the entire array
			reverseAllArray(arr, 0, size);
		}
		System.out.println("final rotation");
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	private static void reverseAllArray(int arr[], int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

}
