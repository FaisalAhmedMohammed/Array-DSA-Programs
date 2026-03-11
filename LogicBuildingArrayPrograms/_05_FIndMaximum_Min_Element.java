package LogicBuildingArrayPrograms;

public class _05_FIndMaximum_Min_Element {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		int max = findMax(arr);
		System.out.println("Maximum Element is : " + max);

		int min = findMin(arr);
		System.out.println("Minimum Element is : " + min);
	}

	private static int findMax(int[] arr) {
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;

	}

	private static int findMin(int[] arr) {

		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;

	}

}
