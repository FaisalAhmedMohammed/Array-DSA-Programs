package LinearSearchAlgorithm;

public class _08_Find_Second_Largest_Element {

	public static void main(String[] args) {

		int[] arr = { 2, 5, 4, 3, 6, 88, 9 };

		int secondLargest = findSecondLargest(arr);
		if (secondLargest == -1) {
			System.out.println("Second largest element not found");
		} else {
			System.out.println("Second largest element: " + secondLargest);
		}
	}

	private static int findSecondLargest(int[] arr) {

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		if (arr == null || arr.length == 0) {
			System.out.println("Array must contain at least 2 elements");
			return -1;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] != largest && arr[i] > secondLargest) {
				secondLargest = arr[i];
			}

		}
		return secondLargest;

	}

}
