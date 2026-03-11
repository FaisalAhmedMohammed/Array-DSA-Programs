package LogicBuildingArrayPrograms;

import java.util.Arrays;

public class _15_Merge_Two_Arrays {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 6, 7, 8, 9, 10 };

		int[] arr3 = new int[arr1.length + arr2.length];
		System.out.println(arr3.length);

		for (int i = 0; i < arr1.length; i++) {

			arr3[i] = arr1[i];
		}

		// Find where to place elements in arr3
		for (int j = 0; j < arr2.length; j++) {
			arr3[arr1.length + j] = arr2[j];// here arr1.length is 5 + 0 == 5
											// next iteration j increases so 6
		}

		System.out.println(Arrays.toString(arr3));

	}

}
