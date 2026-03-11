package LinearSearchAlgorithm;

public class _04_Find_All_Occurance_Of_A_Element {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 3, 4, 5, 5, 2 };

		int target = 2;

		int occurance = findOccurance(arr, target);

		if (occurance > 0) {
			System.out.println("Occurance Of Element is : " + occurance);
		} else {
			System.out.println("Given Element Not Found");
		}
	}

	private static int findOccurance(int[] arr, int target) {

		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == target) {
				count++;

			}
		}
		return count;// after counting elements returing count;

	}

}
