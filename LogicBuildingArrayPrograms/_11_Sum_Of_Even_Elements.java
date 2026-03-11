package LogicBuildingArrayPrograms;

public class _11_Sum_Of_Even_Elements {

	public static void main(String[] args) {

		int[] arr = { 10, 9, 11, 32, 23, 5 };

		int evenSum = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				evenSum += arr[i];
			}
		}

		System.out.println("Sum Of Even Elements : " + evenSum);

	}

}
