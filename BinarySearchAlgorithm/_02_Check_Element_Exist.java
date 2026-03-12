package BinarySearchAlgorithm;

public class _02_Check_Element_Exist {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 8, 10, 12, 14 };

		int target = 6;

		boolean found = checkExist(arr, target);
		if (found) {
			System.out.println("Element Exist in array");
		} else {
			System.out.println("Element does not exist in arrary");

		}
	}

	private static boolean checkExist(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			int mid = (start + end) / 2;

			if (arr[mid] == target) {
				return true;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}
		return false;

	}

}
