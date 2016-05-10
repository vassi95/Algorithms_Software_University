
import java.util.Scanner;

public class Generate_Permutations {
	private static int countOfPermutations = 0;

	public static int getCountOfPermutations() {
		return countOfPermutations;
	}

	public static void setCountOfPermutations(int countOfPermutations) {
		Generate_Permutations.countOfPermutations = countOfPermutations;
	}

	private static void PrintPermutations(int[] arr, int startIndex) {

		int temp;
		int[] newArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		print(newArr);
		boolean done = false;
		while (!done) {
			int i = 0;
			while (i < arr.length - 1 && newArr[i] > newArr[i + 1]) {
				i++;
			}
			if (i == 0) {
				temp = newArr[0];
				newArr[0] = newArr[1];
				newArr[1] = temp;
				print(newArr);
				setCountOfPermutations(getCountOfPermutations() + 1);
			} else {
				for (int j = 0; j < (i + 1) / 2; j++) {
					temp = newArr[j];
					newArr[j] = newArr[i - j];
					newArr[i - j] = temp;
				}
				if (i >= arr.length - 1) {
					done = NextSubset(arr, newArr, startIndex);
					if (!done)
						print(newArr);
					setCountOfPermutations(getCountOfPermutations() + 1);
				} else {

					int m = i;
					while (m >= 0 && newArr[m] > newArr[i + 1]) {
						m--;
					}
					temp = newArr[m];
					newArr[m] = newArr[i + 1];
					newArr[i + 1] = temp;
					print(newArr);
					setCountOfPermutations(getCountOfPermutations() + 1);
				}
			}
		}
	}

	private static boolean NextSubset(int[] arr, int[] newArr, int n) {

		int i = 0;
		while (arr[i] < newArr[0]) {
			i++;
		}
		if (i >= n - arr.length) {
			return true;
		}
		int j = 1;
		while (j < arr.length && arr[i + j] == newArr[j]) {
			j++;
		}
		newArr[j - 1] = arr[i + j];
		if (i > 0) {
			for (int m = 0; m < j - 1; m++) {
				newArr[m] = arr[m];
			}
		}
		return false;
	}

	private static void print(int[] currentPerm) {
		for (int i = 0; i < currentPerm.length; i++) {
			System.out.print((currentPerm[i] + " "));
		}
		System.out.println();
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("n= ");
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}
		PrintPermutations(arr, 0);
		System.out.println("Total permutations: " + getCountOfPermutations());
	}
}
