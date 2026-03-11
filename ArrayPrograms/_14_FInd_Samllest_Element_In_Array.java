package ArrayPrograms;

import java.util.Scanner;

public class _14_FInd_Samllest_Element_In_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array");

		int n = sc.nextInt();

		// creating array with given size
		int[] arr = new int[n];

		int min;

		for (int i = 0; i < arr.length; i++) {

			System.out.println("Enter element at index : " + i);

			arr[i] = sc.nextInt();
		}
		
		// if array is empty then return means terminate program
		if (n == 0) {
			System.out.println("Array is empty");
			return;
		}

		min = arr[0];
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Smallest Element is  : " + min);
	}

}
