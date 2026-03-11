package LogicBuildingArrayPrograms;

public class _06_Find_Frequency_Of_Elements {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 3, 3 };

		findFrequency(arr);
	}

	private static void findFrequency(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == -1) { // here we are verifying the given element i == -1 then sikp
				continue;
			}

			int freq = 1;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					freq++;
					arr[j] = -1;// visited element we are assigning to -1
				}
			}
			System.out.println(" Frequency of : " + arr[i] + " is " + freq);
		}

	}

}
