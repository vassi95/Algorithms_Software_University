
public class Reverse {
	
	public static void reverseArray(int[] a,int i,int j){
		
		if(j<=i){
			return;
		}
			int num=a[i];
			a[i]=a[j];
			a[j]=num;
			reverseArray(a, i+1, j-1);
	
		
	}
	
}
