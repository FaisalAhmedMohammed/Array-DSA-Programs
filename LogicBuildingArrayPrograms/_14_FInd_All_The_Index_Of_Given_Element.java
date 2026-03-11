package LogicBuildingArrayPrograms;

public class _14_FInd_All_The_Index_Of_Given_Element {

	public static void main(String[] args) {

		// Step 1: Declare and initialize the array
		int[] arr = { 10, 9, 11, 32, 9, 5, 9 };

		int search = 9;

		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == search) {

				// Print the index of the element
				System.out.println("Element found at : " + i);

				flag = true;

			}
		}
		// If element is not found
		if (!flag) {
			System.out.println("Elemnt Not Found");
		}
	}

}
