package ArrayPrograms;

import java.util.Scanner;

// it is called linear search
public class _07_SearchElement_In_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array ");

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {

			System.out.println("Enter element at index : " + i);
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter Element to be searched");
		int num = sc.nextInt();

		// this variable tracks at which index we found the element
		int index = -1; // here we are taking -1 because array starts
						// at 0 so we cannot initialize 0

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == num) {
				index = i; // if element found then storing then assign it index to variable
				break;
			}
		}

		if (index != -1) {
			System.out.println("Element found ");
		} else {
			System.out.println("Element not Found");
		}

	}
}
