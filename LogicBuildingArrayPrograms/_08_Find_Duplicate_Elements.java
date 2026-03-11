package LogicBuildingArrayPrograms;

public class _08_Find_Duplicate_Elements {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 3, 3, 3 };

		// Step 1: Create visited array to track processed elements
		boolean[] visited = new boolean[arr.length];

		// Step 2: Traverse the array
		for (int i = 0; i < arr.length - 1; i++) {

			// Step 3: If element already processed, skip it
			if (visited[i] == true) {
				continue;
			}

			// Step 4: Compare current element with remaining elements
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {

					// Step 5: Print duplicate element
					System.out.println(arr[i]);

					// Step 6: Mark duplicate element as visited
					visited[j] = true;

					break; // print only once
				}
			}
		}
	}

}
