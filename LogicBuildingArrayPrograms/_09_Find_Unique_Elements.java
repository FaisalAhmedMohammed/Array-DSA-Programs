package LogicBuildingArrayPrograms;

//We declare count inside the for (int i...) loop because each element needs its own fresh count
public class _09_Find_Unique_Elements {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 3, 3, 4, 5 };

		for (int i = 0; i < arr.length; i++) {

			// Step 3: Initialize count for every element
			int count = 0;

			for (int j = 0; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					count++;
				}

			}
			// counting elements
			if (count == 1) {
				
				// printing elements
				System.out.println(arr[i]);
			}

		}
	}

}
