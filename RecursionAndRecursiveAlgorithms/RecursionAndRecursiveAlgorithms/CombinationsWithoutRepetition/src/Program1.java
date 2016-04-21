import java.util.Scanner;

public class Program1 {

	public static void generateCombinations(int[] array, int index, int start, int n) {

		if (index >= array.length) {
			for (int i : array) {
				System.out.print(i);
			}
			System.out.println();
		}

		else {
			for (int i = start ; i <= n; i++) {
				array[index] = i;
				generateCombinations(array, index + 1, i+1, n);
				
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("n= ");
		int n = input.nextInt();
		System.out.println("k= ");
	
		int k= input.nextInt();
		int[] array = new int[k];
		generateCombinations(array, 0,1, n);

	}

}
