import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FindPaths {
	
	static ArrayList<Character> path = new ArrayList<Character>();
	
	
static char[][] m = new char[][]{
	  { 's', ' ', ' ', ' ' },
	  { ' ', '*', '*', ' ' },
	  { ' ', '*', '*', ' ' },
	  { ' ', '*', 'e', ' ' },
	  { ' ', ' ', ' ', ' ' }
	};
	

	
	public static void main(String[] args) {
		FindPathToExit(0,0,'s');

	}

	static boolean InRange(int row, int col){
		boolean rowInRange = row >= 0 && row < m.length;
		boolean colInRange = col >= 0 && col < m[0].length;
		return rowInRange && colInRange;
	}

	public static void FindPathToExit(int row, int col, char dir){
		if(! InRange(row,col) || m[row][col]== '*' || m[row][col]== '.'){
			
			return;
		}
		if(m[row][col]== 'e'){
			path.add(dir);
			PrintPath();
			path.remove(path.size()-1);
			return;
		}

		
		m[row][col] = '.';
	path.add(dir);
		
		FindPathToExit(row-1,col, 'U');
		FindPathToExit(row,col+1, 'R');
		FindPathToExit(row+1,col, 'D');
		FindPathToExit(row,col-1, 'L');
		path.remove(path.size()-1);
		m[row][col] = ' ';
		}
	
	static void PrintPath()
    {
        
        System.out.println(path.toString());
    }
}
