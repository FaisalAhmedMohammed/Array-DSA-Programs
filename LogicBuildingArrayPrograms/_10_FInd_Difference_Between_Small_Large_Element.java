package LogicBuildingArrayPrograms;

public class _10_FInd_Difference_Between_Small_Large_Element {

	public static void main(String[] args) {

		int[] arr = { 5, 7, 2, 1, 9 };

		int largeElement = arr[0];
		int smallElement = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largeElement) {
				largeElement = arr[i];
			}
			if (arr[i] < smallElement) {
				smallElement = arr[i];
			}
		}
		// formula to find difference
		int difference = largeElement - smallElement;

		System.out.println(difference);
	}

}
