package ArrayPrograms;

import java.util.Scanner;

public class _02_TakeArray_inputFrom_User {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of Array");

		int n = sc.nextInt();

		// declaring array
		int[] arr = new int[n];

		// taking element in to array
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element at index : " + i);
			arr[i] = sc.nextInt();
		}

		// printing elements

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
