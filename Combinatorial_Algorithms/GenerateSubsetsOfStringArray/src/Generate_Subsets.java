import java.util.Arrays;
import java.util.Scanner;

public class Generate_Subsets {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("n= ");
		int n = in.nextInt();
		System.out.println("k= ");
		int k = in.nextInt();
		String[] arr = new String[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.next();
		}
		comb(arr, k, 0, new String[k]);

	}

	static void comb(String[] arr, int len, int startPosition, String[] result) {
		if (len == 0) {
			System.out.println(Arrays.toString(result));
			return;
		}
		for (int i = startPosition; i <= arr.length - len; i++) {
			result[result.length - len] = arr[i];
			comb(arr, len - 1, i + 1, result);
		}
	}

}
