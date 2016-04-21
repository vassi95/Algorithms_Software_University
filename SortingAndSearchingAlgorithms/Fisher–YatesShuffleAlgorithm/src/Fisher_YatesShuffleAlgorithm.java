import java.util.Arrays;
import java.util.Random;

public class Fisher_YatesShuffleAlgorithm {
	public static void shuffle(int[] array) {
	    Random r = new Random();
	    for (int i = array.length - 1; i > 0; i--) {
	      int index = r.nextInt(i);
	      int tmp = array[index];
	      array[index] = array[i];
	      array[i] = tmp;
	    }
	  }
	 
	  public static void main(String[] args) {
	 
	    int [] array = {1,2,3,4,5,6,7,8,9,10,11,12}; 
	    System.out.println("Before: " + Arrays.toString(array));
	 
	    shuffle(array);
	 
	    System.out.println("After:  " + Arrays.toString(array));
	 
	  }

}
