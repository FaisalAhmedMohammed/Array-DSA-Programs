package ArrayPrograms;

import java.util.Scanner;

public class _08_Find_Average_Array_Elements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size");

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element at index at : " + i);
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		double average = 0;

		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];
		}

		average = (double) sum / n; // here we are type casting the sum before
		// dividing so sum become double

		System.out.println(average);

	}

}
