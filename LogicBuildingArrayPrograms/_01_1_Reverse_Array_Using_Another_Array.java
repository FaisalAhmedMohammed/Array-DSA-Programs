package LogicBuildingArrayPrograms;

import java.util.Arrays;

public class _01_1_Reverse_Array_Using_Another_Array {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		reverseArray(arr);
	}

	private static void reverseArray(int[] arr) {

		int[] reverse = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			reverse[i] = arr[arr.length - 1 - i];// 5 - 1 + 0 = 4
		}

		System.out.println(Arrays.toString(reverse));

	}

}
