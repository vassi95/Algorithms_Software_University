import java.util.Date;

public class TestClass {

	public static void main(String[] args) {
		Reverse r = new Reverse();
	
		int[] array = {1, 2, 3, 4, 5, 6};
		r.reverseArray(array, 0, array.length-1);
		for(int i=0; i<array.length; i++){
			System.out.println(array[i]);
		}
		
	}

}
