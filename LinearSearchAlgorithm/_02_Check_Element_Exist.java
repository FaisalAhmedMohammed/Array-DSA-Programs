package LinearSearchAlgorithm;

public class _02_Check_Element_Exist {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 9, 12, 3, 8 };

		boolean exist = checkExist(arr, 0);

		if (exist) {
			System.out.println("Element Found");
		} else {
			System.out.println("Element Not Found");
		}
	}

	private static boolean checkExist(int[] arr, int element) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == element) {

				return true;
			}
		}
		return false;

	}

}
