package LinearSearchAlgorithm;

public class _05_FInd_All_Indexes_Of_Element {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 4, 5, 5, 2 };

		int target = 0;

		findIndexes(arr, target);
	}

	private static void findIndexes(int[] arr, int target) {

		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == target) {

				flag = true;

				System.out.print(i + " ");
			}

		}
		if (!flag) {
			System.out.println("Element Not Found");
		}

	}

}
