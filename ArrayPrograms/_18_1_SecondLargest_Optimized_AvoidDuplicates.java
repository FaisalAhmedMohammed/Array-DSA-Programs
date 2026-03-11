package ArrayPrograms;

public class _18_1_SecondLargest_Optimized_AvoidDuplicates {

	public static void main(String[] args) {

		int[] arr = { 10, 10 };

		int large = Integer.MIN_VALUE;

		int second = Integer.MIN_VALUE;

		if (arr.length < 2) {
			System.out.println("Array must have atlest 2 elements");
			return;
		}

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > large) {
				second = large;
				large = arr[i];
			} else if (arr[i] != large && arr[i] > second) {
				second = arr[i];
			}
		}
		if (second == Integer.MIN_VALUE) {
			System.out.println("No second distinct largest element found");
		} else {
			System.out.println("SECOND LARGEST ELEMENT OF THE ARRAY IS : " + second);
		}

	}

}
