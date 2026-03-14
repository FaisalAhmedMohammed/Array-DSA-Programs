package BinarySearchAlgorithm;

public class _05_Print_Last_Occurance_Of_Element {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 8, 8, 8, 10, 12 };
		int target = 8;

		int last = findLast(arr, target);

		System.out.println("Last Occurrence Index : " + last);
	}

	public static int findLast(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;
		int result = -1;

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (arr[mid] == target) {
				result = mid;
				start = mid + 1; // move right
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		return result;
	}
}