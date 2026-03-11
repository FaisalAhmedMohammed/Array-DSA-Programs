package LogicBuildingArrayPrograms;

public class _04_Count_Positive_Negative_Zero {

	public static void main(String[] args) {

		int[] arr = { 3, -1, 0, 7, -5, 0, 2 };

		int positive = 0;
		int negative = 0;
		int zero = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > 0) {
				positive++;
			} else if (arr[i] < 0) {
				negative++;
			} else {
				zero++;
			}

		}
		System.out.println("Positive numbers: " + positive);
		System.out.println("Negative numbers: " + negative);
		System.out.println("Zero values: " + zero);
	}

}
