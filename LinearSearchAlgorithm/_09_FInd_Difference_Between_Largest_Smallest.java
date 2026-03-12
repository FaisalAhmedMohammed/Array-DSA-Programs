package LinearSearchAlgorithm;

public class _09_FInd_Difference_Between_Largest_Smallest {

	public static void main(String[] args) {

		int[] arr = { 4, 9, 2, 7 };

		int difference = findDifference(arr);
		if (difference != -1) {
			System.out.println("Diffenece is  : " + difference);
		}

	}

	private static int findDifference(int[] arr) {

		if (arr == null || arr.length < 2) {
			System.out.println("Array must contains atlest two elements");
			return -1;
		}

		int largest = arr[0];
		int smallest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];

			}

			if (arr[i] < smallest) {
				smallest = arr[i];

			}
		}
		int difference = largest - smallest;
		return difference;

	}

}
