package ArrayPrograms;

import java.util.Scanner;

public class _04_FindLength_Of_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array");

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {

			System.out.println("Enter Element at index at : " + i);

			arr[i] = sc.nextInt();

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			System.out.println();
		}
		System.out.println("Array length is  : " + arr.length);
		sc.close();
	}

}
