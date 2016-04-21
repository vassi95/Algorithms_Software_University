import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;


public class Program {

	/*static char[][] m = new char[][]{
		  { ' ', ' ', ' ', '*', ' ', ' ', ' ' , '*', ' ' },
		  { ' ', ' ', ' ', '*', ' ', ' ', ' ' , '*', ' ' },
		  { ' ', ' ', ' ', '*', ' ', ' ', ' ' , '*', ' ' },
		  { ' ', ' ', ' ', ' ', '*', ' ', '*' , ' ', ' ' }
		};*/
		
	static char[][] m = new char[][] { 
		{ '*', ' ', ' ', '*', ' ', ' ', ' ', '*', ' ', ' ' },
		{ '*', ' ', ' ', '*', ' ', ' ', ' ', '*', ' ' , ' '}, 
		{ '*', ' ', ' ', '*', '*', '*', '*', '*', ' ' , ' '},
		{ '*', ' ', ' ', '*', ' ', ' ', ' ', '*', ' ' , ' '},
		{ '*', ' ', ' ', '*', ' ', ' ', ' ', '*', ' ' , ' '}

	};
		static SortedSet<Area> areas = new TreeSet<Area>(); 

		static int size;
		static int j=1;
		public static void main(String[] args) {
			for(int row = 0 ; row < m.length; row++){
				for(int col=0; col<m[0].length; col ++){
					if(m[row][col] ==' '){
						FindConnectedAreas(row, col);
						areas.add(new Area(row,col,size));
						
						size = 0;
					}
				}
			}
			System.out.println("Total areas found: " +Area.numberOfAreas);
			//for(Area a:areas){
			//for(int j=0; j<Area.numberOfAreas;j++){
			
				for(Object o : areas){
				System.out.println("Area #" + (j++)+ " at" + o.toString());
			}

		}

		static boolean InRange(int row, int col){
			boolean rowInRange = row >= 0 && row < m.length;
			boolean colInRange = col >= 0 && col < m[0].length;
			return rowInRange && colInRange;
		}

		public static void FindConnectedAreas(int row, int col){
			if(! InRange(row,col) || m[row][col]== '*' || m[row][col]== '.'){
				
				return;
			}
			
			
			m[row][col] = '.';
			size++;
			FindConnectedAreas(row-1,col);
			FindConnectedAreas(row,col+1);
			FindConnectedAreas(row+1,col);
			FindConnectedAreas(row,col-1);

			}

		
	
		
}
