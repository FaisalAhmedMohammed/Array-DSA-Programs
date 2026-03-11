package ArrayPrograms;

public class _21_Check_Array_Sorted_In_Desending_Order {

	public static void main(String[] args) {

		int[] arr = { 5, 4, 3, 2, 1 };

		boolean isDescending = true;

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > arr[i - 1]) {
				isDescending = false;
				break;
			}

		}
		if (isDescending) {
			System.out.println("Sorted in Desceding order");
		} else {
			System.out.println("Not soretd in descending order");
		}
	}

}
