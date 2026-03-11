package LogicBuildingArrayPrograms;

public class _03_Count_Of_Even_Odd {

	public static void main(String[] args) {

		int[] arr = { 10, 9, 11, 32, 23, 5 };

		int evenCount = 0;
		int oddCount = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("Even Count  : " + evenCount);
		System.out.println("Odd Count  : " + oddCount);

	}

}
