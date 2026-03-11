package ArrayPrograms;

public class _20_Check_Whether_ArrayIs_In_Sorted_Or_Not {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		boolean isSorted = true;

		// here we have to start loop 1 because to compare previous element
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < arr[i - 1]) {
				isSorted = false;
				break;
			}
		}
		if (isSorted) {
			System.out.println("Given Array is sorted array");
		} else {
			System.out.println("Array is not Sorted Array");
		}
	}

}
