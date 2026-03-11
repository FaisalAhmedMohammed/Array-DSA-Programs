package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class _15_Insert_Element_At_Given_Position {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array");

		int n = sc.nextInt(); // 5

		// create array with extra space
		int[] arr = new int[n + 1];

		// input elements
		for (int i = 0; i < n; i++) {

			System.out.println("Insert element at index : " + i);

			arr[i] = sc.nextInt();
		}
		// Enter Position to insert element
		System.out.println("Enter Position to insert element");
		int pos = sc.nextInt();

		// Insert element at a given position
		System.out.println("Insert new Element ");
		int newElement = sc.nextInt();

		
		//One Small Improvement (Recommended)
		//You should check valid position.

		if(pos < 0 || pos > n){
		    System.out.println("Invalid Position");
		    return;
		}
		//// shifting elements left to right
		for (int i = n; i > pos; i--) {
			arr[i] = arr[i - 1];
		}

		// insert element
		arr[pos] = newElement;
		n++;

		System.out.println(Arrays.toString(arr));
	}

}
