package LinearSearchAlgorithm;

public class _06_FInd_Maximum_Element {

	public static void main(String[] args) {

		int[] arr = { 5, 5 };

		int max2 = findMax(arr);
		System.out.println("Maximum element is: " + max2);
	}

	private static int findMax(int[] arr) {

		int max = arr[0];

		if (arr.length == 0) {
			System.out.println("Array is empty");
			return -1;
		}

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;

	}

}
