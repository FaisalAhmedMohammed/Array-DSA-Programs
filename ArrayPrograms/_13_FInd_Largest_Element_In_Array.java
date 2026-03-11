package ArrayPrograms;

public class _13_FInd_Largest_Element_In_Array {

	public static void main(String[] args) {

		int[] arr = { 5, 19, 7, 10, 28 };

		// Assume first element is biggest
		int max = arr[0];

		// Finding biggest element
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}

		}

		System.out.println("Biggest element is: " + max);
	}

}
