package BinarySearchAlgorithm;

// it follows divided and conquer format
public class _01_BinarySearch {

	public static void main(String[] args) {

		// Step 1: Declare and initialize a sorted array
		int[] arr = { 2, 4, 6, 8, 10, 12 };

		// Step 2: Element to search
		int target = 10;

		// Step 3: Call binary search method
		int index = binarySearch(arr, target);

		// Step 4: Check result
		if (index != -1) {
			System.out.println("Element found at index: " + index);
		} else {
			System.out.println("Element not found");
		}
	}

	private static int binarySearch(int[] arr, int target) {

		// Step 5: Initialize start and end
		int start = 0;
		int end = arr.length - 1;

		// Step 6: Repeat until search space is valid
		while (start <= end) {

			// Step 7: Find middle index
			int mid = (start + end) / 2;

			// Step 8: Check if element found
			if (arr[mid] == target) {
				return mid;
			}

			// Step 9: If target is greater, search right side
			else if (arr[mid] < target) {
				start = mid + 1;
			}

			// Step 10: If target is smaller, search left side
			else {
				end = mid - 1;
			}
		}

		// Step 11: Element not found
		return -1;
	}
}