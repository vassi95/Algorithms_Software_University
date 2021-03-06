import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Permutations {

	public static void main(String args[]) {
		int[] arr = new int[] { 1, 1, 5, 5 };
		Arrays.sort(arr);
		permute(arr, 0, arr.length);
	}

	public static void permute(int[] arr, int start, int n) {
		Print(arr);
		int tmp = 0;

		if (start < n) {
			for (int i = n - 2; i >= start; i--) {
				for (int j = i + 1; j < n; j++) {
					if (arr[i] != arr[j]) {
						tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;

						permute(arr, i + 1, n);
					}
				}

				tmp = arr[i];
				for (int k = i; k < n - 1;)
					arr[k] = arr[++k];
				arr[n - 1] = tmp;
			}
		}
	}

	static void Print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print((arr[i] + " "));
		}
		System.out.println();
	}

}
