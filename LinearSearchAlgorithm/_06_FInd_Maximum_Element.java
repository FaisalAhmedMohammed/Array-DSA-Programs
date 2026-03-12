package LinearSearchAlgorithm;

public class _06_FInd_Maximum_Element {

	public static void main(String[] args) {

		int[] arr = { 2, 1, 4, 6, 7, 8 }; // here if arr = null then we will get NullPointerException

		int max2 = findMax(arr);

		if (max2 != -1) {
			System.out.println("Maximum element is: " + max2);
		}
	}

	private static int findMax(int[] arr) {

		if (arr == null || arr.length == 0) {
			System.out.println("Array is empty");
			return -1;
		}
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;

	}

}
