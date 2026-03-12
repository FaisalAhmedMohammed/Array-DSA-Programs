package BinarySearchAlgorithm;

public class _03_FInd_Index_Of_Element {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16 };

		int target = 8;

		int index = findIndex(arr, target);
		if (index != -1) {
			System.out.println("Element Found at index : " + index);
		} else {
			System.out.println("Element Not Found");
		}
	}

	private static int findIndex(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			int mid = (start + end) / 2;

			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		return -1;

	}

}
