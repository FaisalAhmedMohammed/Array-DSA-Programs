package BinarySearchAlgorithm;

public class FirstOccur {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 8, 8, 8, 10, 12 };

		int target = 8;

		int first = findFirst(arr, target);
		System.out.println(first);
	}

	private static int findFirst(int[] arr, int target) {

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

}
