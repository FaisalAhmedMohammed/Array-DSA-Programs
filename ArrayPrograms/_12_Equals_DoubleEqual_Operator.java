package ArrayPrograms;

import java.util.Arrays;

public class _12_Equals_DoubleEqual_Operator {

	public static void main(String[] args) {

		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = { 10, 20, 30, 40, 50 };

		if (arr1 == arr2) {
			System.out.println("Both are Equal");
		} else {
			System.out.println("Both are not Equal");
		}

		System.out.println("====".repeat(20));

		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Both are Equal");
		} else {
			System.out.println("Both are not Equal");
		}

	}

}
