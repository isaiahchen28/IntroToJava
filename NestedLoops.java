
public class NestedLoops {

	public static void main(String[] args) {
		
		// print a square
		System.out.print("How many lines of stars: ");
		int n = IO.readInt();
		
		// outer loop will print n lines
		for (int l = 0; l < n; l++) {
			
			// inner loop will print n stars in a line
			for (int s = 0; s < n; s++) {
				System.out.print("* ");
			}
			System.out.println(); // prints a new line
		}
		
		// print a triangle
		// outer loop will print n lines
		for (int l = 0; l < n; l++) {
			// inner loop will print up to l stars in a line
			for (int s = 0; s <= l; s++) {
				System.out.print("* ");
			}
			System.out.println(); // prints a new line
		}
	}

}
