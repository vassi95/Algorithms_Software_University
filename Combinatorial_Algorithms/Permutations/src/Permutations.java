import java.util.Scanner;

public class Permutations {

	private static int countOfPermutations = 0;

	public static void permute(int[] input, int startindex) {
		int size = input.length;

		if (size == startindex + 1) {
			for (int i = 0; i < size; i++) {
				System.out.print(input[i] + ",  ");
			}
			System.out.println();
			setCountOfPermutations(getCountOfPermutations() + 1);
		} else {
			for (int i = startindex; i < size; i++) {

				int temp = input[i];
				input[i] = input[startindex];
				input[startindex] = temp;
				permute(input, startindex + 1);

				int temp2 = input[i];
				input[i] = input[startindex];
				input[startindex] = temp2;
			}
		}
	}

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		System.out.println("n= ");
		int arr = in.nextInt();
		int[] input = new int[arr];
		for (int i = 0; i < arr; i++) {
			input[i] = i + 1;
		}

		permute(input, 0);
		System.out.println("Total permutations: " + getCountOfPermutations());

	}

	public static int getCountOfPermutations() {
		return countOfPermutations;
	}

	public static void setCountOfPermutations(int countOfPermutations) {
		Permutations.countOfPermutations = countOfPermutations;
	}
}
