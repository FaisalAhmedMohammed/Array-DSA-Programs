package LogicBuildingArrayPrograms;

public class _13_Check_Element_Contain_In_Array {

	public static void main(String[] args) {

		// Step 1: Declare and initialize the array
		int[] arr = { 10, 9, 11, 32, 23, 5 };

		int search = 0;

		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == search) {

				// Print the index of the element
				System.out.println("Element found at : " + i);

				flag = true;
				break;
			}
		}
		// If element is not found
		if (!flag) {
			System.out.println("Elemnt Not Found");
		}
	}

}
