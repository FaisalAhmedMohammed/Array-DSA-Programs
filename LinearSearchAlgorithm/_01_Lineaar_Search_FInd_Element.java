package LinearSearchAlgorithm;

public class _01_Lineaar_Search_FInd_Element {

	public static void main(String[] args) {

		int[] arr = { 2, 5, 4, 7, 13 };

		int result = linearSearch(arr, 0);

		if (result != -1) {
			System.out.println("Element found at index : " + result);
		} else {
			System.out.println("Element Not Found");
		}
	}

	private static int linearSearch(int[] arr, int target) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == target) {

				return i; // element found

			}
		}
		return -1; // element not found
	}

}
