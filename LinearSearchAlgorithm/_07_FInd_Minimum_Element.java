package LinearSearchAlgorithm;

public class _07_FInd_Minimum_Element {
	public static void main(String[] args) {

		int[] arr = { 1, 4, 3, 5, 7, 9 };

		int min = findMin(arr);
		System.out.println("Minimum element is: " + min);
	}

	private static int findMin(int[] arr) {

		int minElement = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < minElement) {
				minElement = arr[i];

			}
		}
		return minElement;
	}

}
