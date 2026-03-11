package ArrayPrograms;

public class _01_Declare_initialize_Print_Array {

	public static void main(String[] args) {
		
		//printing array using static array
		int[] arr = { 10, 11, 23, 30, 40 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("=".repeat(30));

		int[] arr1 = new int[3];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;

		for (int a : arr1) {
			System.out.println(a);
		}

	}

}
