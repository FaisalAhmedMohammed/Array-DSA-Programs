package LinearSearchAlgorithm;

public class _03_Find_Index_Of_Given_Element {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 11, 23, 17, 5 };

		int target = 0;

		int index = findIndex(arr, target);
		if (index != -1) { // checking if the element is NOT EQUAL TO -1
			System.out.println("Element found at index : " + index);
		} else {
			System.out.println("Element Not Found");
		}
	}

	private static int findIndex(int[] arr, int target) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
}