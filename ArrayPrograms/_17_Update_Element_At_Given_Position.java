package ArrayPrograms;

import java.util.Scanner;

public class _17_Update_Element_At_Given_Position {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array");

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element at index  : " + i);

			arr[i] = sc.nextInt();
		}

		System.out.println("Enter Index to Update ");
		int index = sc.nextInt();

		if (index >= 0 && index < arr.length) {// to avoid AIIOB Exception

			System.out.println("Enter New value to Update");

			int newval = sc.nextInt();

			arr[index] = newval;

			System.out.println("Array After Update");

			for (int i = 0; i < arr.length; i++) {

				System.out.print(arr[i] + " ");
			}

		} else {
			System.out.println("Invalid index");
		}
	}

}
