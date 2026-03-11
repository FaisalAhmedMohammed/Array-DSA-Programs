package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class _16_Delete_Element_From_Index {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array");

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter Element at index : " + i);

			arr[i] = sc.nextInt();
		}

		System.out.println("Enter Position to be deleted");

		int position = sc.nextInt();

		for (int i = position; i < n - 1; i++) {

			arr[i] = arr[i + 1];
		}
		
		// decrease logical size
		n--;

		// print updated array
		System.out.println("Array after deletion:");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
