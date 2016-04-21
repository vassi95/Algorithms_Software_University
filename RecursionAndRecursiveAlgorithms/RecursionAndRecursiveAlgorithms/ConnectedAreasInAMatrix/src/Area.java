
public class Area implements Comparable<Area>{
	public Integer row;
	public Integer col;
	public Integer size;
	static int numberOfAreas=0;
	public Area(int row, int col, int size) {
		this.row = row;
		this.col = col;
		this.size = size;
		numberOfAreas++;
	}

	@Override
	public String toString() {
		return "(" + row + "," + col + ")" + ", size: " + size ;
	}

	@Override
	public int compareTo(Area other) {
		 if (this.size.compareTo(other.size) != 0)
            {
                return -1 * this.size.compareTo(other.size);
            }

            if (this.row.compareTo(other.row) != 0)
            {
                return this.row.compareTo(other.row);
            }

            return this.col.compareTo(other.col);
	}
	
}
