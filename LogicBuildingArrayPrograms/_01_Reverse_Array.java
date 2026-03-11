package LogicBuildingArrayPrograms;

import java.util.Arrays;

// reverse array means changing the array not printing array in reverse order
public class _01_Reverse_Array {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		int start = 0;
		int end = arr.length - 1;

		while (start < end) {

			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}

		System.out.println(Arrays.toString(arr));
	}

}
