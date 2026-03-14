package BinarySearchAlgorithm;
/*   Count Occurrences means finding how many times the target element appears in a sorted array using Binary Search.
     Instead of scanning the whole array, we find:
1️⃣ First Occurrence of the element
2️⃣ Last Occurrence of the element
Then calculate the count.

Formula:
count = lastIndex - firstIndex + 1

*/
public class _06_Count_Occurrance_Of_Element {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 6, 6, 8, 10, 12 };

		int target = 6;

		int countOccurrance = findCountOccurrance(arr, target);

		System.out.println("Total Occurance : " + countOccurrance);
	}

	private static int findCountOccurrance(int[] arr, int target) {

		int firstOccurrance = findFirstOccurrance(arr, target);

		int lastOccurrance = findLastOccurrance(arr, target);

		int count = lastOccurrance = firstOccurrance + 1;

		return count;

	}

	public static int findFirstOccurrance(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;
		int result = -1;

		while (start <= end) {

			int mid = (start + end) / 2;

			if (arr[mid] == target) {

				result = mid;
				end = mid - 1;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {

				end = mid - 1;
			}
		}
		return result;

	}

	private static int findLastOccurrance(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;
		int result = -1;

		while (start <= end) {

			int mid = (start + end) / 2;

			if (arr[mid] == target) {
				result = mid;
				start = mid + 1;

			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}
		return result;

	}

}
