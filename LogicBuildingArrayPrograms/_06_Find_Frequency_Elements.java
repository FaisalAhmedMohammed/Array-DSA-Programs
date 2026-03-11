package LogicBuildingArrayPrograms;

public class _06_Find_Frequency_Elements {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 3, 3, 3 };

		boolean[] visited = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {

			if (visited[i] == true) {
				continue;
			}

			int freq = 1;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					freq++;
					visited[j] = true;
				}
			}
			System.out.println("Frequency of :" + arr[i] + " is = " + freq);
		}
	}

}
/*
 Step-by-Step Explanation
1️⃣ Array Declaration
int[] arr = {1, 2, 2, 3, 3, 3};

Array elements:

Index : 0 1 2 3 4 5
Value : 1 2 2 3 3 3

2️⃣ Visited Array
boolean[] visited = new boolean[arr.length];

This array helps to avoid counting the same element again.

Initially:

visited = {false, false, false, false, false, false}
3️⃣ Outer Loop
for (int i = 0; i < arr.length; i++)

This loop selects the current element.

Example:

i = 0 → element = 1
i = 1 → element = 2
i = 2 → element = 2
...
4️⃣ Skip Already Counted Elements
if (visited[i] == true) {
    continue;
}

If the element is already counted earlier, skip it.

Example:

2 at index 1 counted
2 at index 2 already counted
so skip index 2
5️⃣ Initialize Count
int count = 1;

Why 1?

Because the element itself counts once.

Example:

arr[i] = 2
count = 1
6️⃣ Inner Loop (Compare Remaining Elements)
for (int j = i + 1; j < arr.length; j++)

We compare the current element with remaining elements.

Example:

i = 1 → element = 2
compare with index 2,3,4,5
7️⃣ If Elements Match
if (arr[i] == arr[j])

If both elements are equal:

2 == 2

Then

count++;
visited[j] = true;

Increase count

Mark the element as visited.

Example:

count = 2
visited[2] = true
8️⃣ Print Frequency
System.out.println(arr[i] + " -> " + count);

Output:

1 -> 1
2 -> 2
3 -> 3
 */
