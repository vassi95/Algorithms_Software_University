
public class Interpolation_Search {

	public static void main(String[] args) {
		int[] input = { 0, 1, 2, 3, 4, 12, 34, 55, 58 };
		
		int result = InterpolationSearch(input, 58);
		 
        if (result == -1)
            System.out.println(" element not found");
        else
            System.out.println(" element found at position: "+ result);

	}

	static int InterpolationSearch(int[] sortedArray, int key) {
		  int low = 0;
		  int high = sortedArray.length - 1;
		  while (sortedArray[low] <= key && sortedArray[high] >= key) {
		    int mid = low + ((key - sortedArray[low]) * (high - low))
		      / (sortedArray[high] - sortedArray[low]);
		    if (sortedArray[mid] < key)
		      low = mid + 1;
		    else if (sortedArray[mid] > key)
		      high = mid - 1;
		    else
		      return mid;
		  }
		  if (sortedArray[low] == key) return low;
		  else return -1;
		}
	

}
