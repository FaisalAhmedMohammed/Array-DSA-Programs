package ArrayPrograms;

import java.util.Arrays;

public class _06_Copy_Elements_From_1To_AnotherArray {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5 };

		int[] arr2 = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++) {

			arr2[i] = arr1[i];

		}

		System.out.println("Printing Second Array Elements");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		System.out.println("=".repeat(30));
		arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));

		System.out.println("=".repeat(30));

		arr2.clone();
		System.out.println(Arrays.toString(arr2));
	}

}
