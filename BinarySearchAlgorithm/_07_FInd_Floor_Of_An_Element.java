package BinarySearchAlgorithm;

/*Floor of an element in a sorted array is the greatest 
 * element in the array that is less than or equal to the target element.
 
 In simple words:
The closest smaller number (or equal) to the target.

 */
public class _07_FInd_Floor_Of_An_Element {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 8, 10 };

		int target = 7;

		int floor = findFloor(arr, target);
		System.out.println("Floor of Element is : " + floor);
	}

	private static int findFloor(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;
		int floor = -1;

		while (start <= end) {

			int mid = (start + end) / 2;

			if (arr[mid] == target) {
				return arr[mid];
			} else if (target > arr[mid]) {

				floor = arr[mid];// store floor element
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}

		return floor;

	}

}
