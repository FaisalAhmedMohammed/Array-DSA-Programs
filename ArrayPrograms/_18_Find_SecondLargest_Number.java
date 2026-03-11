package ArrayPrograms;

public class _18_Find_SecondLargest_Number {

	public static void main(String[] args) {

		int[] arr = { 19, 32, 11, 90, 75 };

		int max1 = arr[0];
		int max2 = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max1) {
				max2 = max1;
				max1 = arr[i];
			} else if (arr[i] != 0 && arr[i] > max2) {
				max2 = arr[i];
			}
		}
		System.out.println("Second Largest Number is :" + max2);
	}

}
