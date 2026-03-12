package BinarySearchAlgorithm;

public class _04_Print_First_Occurance_Of_Element {

	public static void main(String[] args) {

		// Step 1: Declare and initialize a sorted array
		int[] arr = { 2, 4, 6, 6, 6, 8, 10, 12 };

		// Step 2: Element to search
		int target = 6;

		// Step 3: Call method to find first occurrence
		int index = firstOccurrence(arr, target);

		// Step 4: Print result
		if (index != -1) {
			System.out.println("First Occurrence of element is at index: " + index);
		} else {
			System.out.println("Element not found");
		}
	}

	private static int firstOccurrence(int[] arr, int target) {

		// Step 5: Initialize start and end pointers
		int start = 0;
		int end = arr.length - 1;

		// Step 6: Variable to store result
		int result = -1;

		// Step 7: Repeat until search space becomes invalid
		while (start <= end) {

			// Step 8: Find middle index
			int mid = (start + end) / 2;

			// Step 9: If element found
			if (arr[mid] == target) {

				// Store the index
				result = mid;

				// Move to left side to check if earlier occurrence exists
				end = mid - 1;
			}

			// Step 10: If middle element is smaller than target
			else if (arr[mid] < target) {

				// Search in right half
				start = mid + 1;
			}

			// Step 11: If middle element is greater than target
			else {

				// Search in left half
				end = mid - 1;
			}
		}

		// Step 12: Return the first occurrence index
		return result;
	}
}