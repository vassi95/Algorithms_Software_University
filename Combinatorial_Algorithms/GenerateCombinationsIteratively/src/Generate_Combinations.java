import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Generate_Combinations {
	  public static void main(String[] args){
		  Scanner in = new Scanner(System.in);
			System.out.println("n= ");
			int n = in.nextInt();
			System.out.println("k= ");
			int k = in.nextInt();
			LinkedList<String> combs = (comb(k,n));
			for(String s : combs){
				System.out.println(s);
			}
  }

  public static String bitprint(int u){
          String s= "";
          for(int n= 1;u > 0;++n, u>>= 1)
                  if((u & 1) > 0) s+= n + " ";
          return s;
  }

  public static int bitcount(int u){
          int n;
          for(n= 0;u > 0;++n, u&= (u - 1));
          return n;
  }

  public static LinkedList<String> comb(int c, int n){
          LinkedList<String> s= new LinkedList<String>();
          for(int u= 0;u < 1 << n;u++)
                  if(bitcount(u) == c) s.push(bitprint(u));
          Collections.sort(s);
          return s;
  }
}
