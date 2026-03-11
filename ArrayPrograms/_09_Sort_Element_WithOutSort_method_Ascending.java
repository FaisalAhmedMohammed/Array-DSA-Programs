package ArrayPrograms;

import java.util.Scanner;

//Selection Sort Algorithm
public class _09_Sort_Element_WithOutSort_method_Ascending {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array ");

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {

			System.out.println("Enter element at index : " + i);

			arr[i] = sc.nextInt();
		}

		// Sorting logic
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}

		// Print after sorting
		System.out.println("Elements after sorting");
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}

 	}

}
