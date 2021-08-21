
public class TestArrayPrinting {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };

		System.out.print(java.util.Arrays.toString(arr));
		System.out.println();

		// this one you don't have to name it
		System.out.print(java.util.Arrays.toString(new int[] { 20, 40, 60, 40, 60, 100 }));
		System.out.println();

		// preincrement
		for (int i = 0; i < arr.length; ++i)		{
		    System.out.println(arr[i]);
		}
                System.out.println();

		// post-increment
		for (int i = 1; i < arr.length; i++) {

			// arr[i] = arr[i - 1];

			System.out.println(arr[i] + " ");
		}

		// pre-increment or post-increment prints 1 1 1 1 1 1
		for (int i = 1; i < arr.length; ++i) {

			arr[i] = arr[i - 1]; // arr[i] = arr[0], which always assigns 1

			System.out.print(arr[i] + " ");

		}
	}
}
