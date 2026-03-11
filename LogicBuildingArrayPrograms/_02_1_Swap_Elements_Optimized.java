package LogicBuildingArrayPrograms;

public class _02_1_Swap_Elements_Optimized {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };

		System.out.println("Elements before swapping");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// take index which you want to swap
		int index1 = 0;// index0 swap to 
		int index2 = 2;// index3

		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;

		System.out.println("Elements after swapping");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
