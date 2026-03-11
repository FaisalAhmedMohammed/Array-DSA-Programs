package ArrayPrograms;

public class _19_FInd_Second_Smallest_Element {

	public static void main(String[] args) {

		int[] arr = { 19, 32, 11, 90, 75 };

		int small = Integer.MAX_VALUE;

		int secondSmall = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < small) {

				secondSmall = small;
				small = arr[i];
			} else if (arr[i] != small && arr[i] < secondSmall) {
				secondSmall = arr[i];
			}
		}
		System.out.println("Smallest: " + small);
		System.out.println("Second Smallest: " + secondSmall);
	}

}
