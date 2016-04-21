
import java.util.Stack;

public class TowerOfHanoi {
	static int stepsTaken = 0;
	private static Stack<Integer> source;
	private static Stack<Integer> destination = new Stack<Integer>();
	private static Stack<Integer> spare = new Stack<Integer>();

	private static void MoveDisks(int bottomDisk, Stack<Integer> sourceRod, Stack<Integer> destinationRod,
			Stack<Integer> spareRod) {
		if (bottomDisk < 1) {
			return;
		}
		if (bottomDisk == 1) {
			stepsTaken++;
			destinationRod.push(sourceRod.pop());
			System.out.println("Step#: " + stepsTaken + " Moved disk: " + bottomDisk);
			PrintRods();
			return;
		} else {

			MoveDisks(bottomDisk - 1, sourceRod, spareRod, destinationRod);
			stepsTaken++;
			destinationRod.push(sourceRod.pop());
			System.out.println("Step#: " + stepsTaken + " Moved disk: " + bottomDisk);

			PrintRods();
			MoveDisks(bottomDisk - 1, spareRod, destinationRod, sourceRod);

		}
	}

	private static void PrintRods() {

		System.out.println(" Source " + source.toString());
		System.out.println("Destination " + destination.toString());
		System.out.println("Spare " + spare.toString());
		System.out.println();

	}

	public static void main(String[] args) {
		int numberOfDisks = 3;
		source = new Stack<Integer>();
		source.push(3);
		source.push(2);
		source.push(1);
		PrintRods();
		MoveDisks(numberOfDisks, source, destination, spare);

	}

}
