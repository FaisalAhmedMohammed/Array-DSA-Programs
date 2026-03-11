package LogicBuildingArrayPrograms;

public class _07_Remove_Duplicate_Elements {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 3, 3, 3 };

		// Step 1: Create visited array to track duplicates
		boolean[] visited = new boolean[arr.length];

		// Step 2: Traverse the array
		for (int i = 0; i < arr.length; i++) {

			// Step 3: If element already visited, skip it
			if (visited[i] == true) {
				continue;
			}

			// Step 4: Print the element (first occurrence)
			System.out.print(arr[i] + " ");

			// Step 5: Compare with remaining elements
			for (int j = i + 1; j < arr.length; j++) {

				// Step 6: If duplicate found
				if (arr[i] == arr[j]) {

					// Mark duplicate as visited
					visited[j] = true;
				}

			}
		}
	}

}
