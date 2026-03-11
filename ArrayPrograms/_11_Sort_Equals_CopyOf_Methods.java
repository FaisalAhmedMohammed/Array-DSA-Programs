package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class _11_Sort_Equals_CopyOf_Methods {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array");

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element at index : " + i);

			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		System.out.println("Element Sorted Using Arrays.sort() method");

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}
		System.out.println("=".repeat(30));

		System.out.println("Enter Array 2 size");

		int n2 = sc.nextInt();

		int[] arr2 = new int[n2];

		for (int i = 0; i < arr2.length; i++) {

			System.out.println("Enter element at index : " + i);

			arr2[i] = sc.nextInt();
		}

		boolean equals = Arrays.equals(arr, arr2);
		System.out.println("Are they are equal ? :" + equals);
		System.out.println("=".repeat(30));

		int[] newarr = Arrays.copyOf(arr, n);

		System.out.println("After coping");

		for (int i = 0; i < newarr.length; i++) {
			System.out.println(newarr[i]);
		}

	}

}
