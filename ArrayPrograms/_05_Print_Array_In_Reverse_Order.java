package ArrayPrograms;

import java.util.Scanner;

public class _05_Print_Array_In_Reverse_Order {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array");

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {

			System.out.println("Enter element at index : " + i);

			arr[i] = sc.nextInt();
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		sc.close();

	}

}
