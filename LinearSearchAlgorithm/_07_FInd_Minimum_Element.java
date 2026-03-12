package LinearSearchAlgorithm;

public class _07_FInd_Minimum_Element {
	public static void main(String[] args) {

		int[] arr = { 6, 2, 7, 8, 4};

		int min = findMin(arr);
		if (min != -1) {
			System.out.println("Minimum element is: " + min);
		}

	}

	private static int findMin(int[] arr) {

		if (arr == null || arr.length == 0) {
			System.out.println("Array is Empty");
			return -1;
		}

		int minElement = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < minElement) {
				minElement = arr[i];

			}
		}
		return minElement;
	}

}
