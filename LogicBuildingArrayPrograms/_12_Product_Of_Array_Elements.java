package LogicBuildingArrayPrograms;

public class _12_Product_Of_Array_Elements {

	public static void main(String[] args) {

		// Step 1: Declare and initialize the array
		int[] arr = {10, 9, 11, 32, 23, 5};

		// Step 2: Initialize product variable with 1
		int prod = 1;

		// Step 3: Traverse the array
		for (int i = 0; i < arr.length; i++) {

			// Step 4: Multiply each element with prod
			prod = prod * arr[i];
		}

		// Step 5: Print the final product
		System.out.println("Product of Elements are : " + prod);
	}
}