
public class Cheers {
	
	public static void main(String[] args) {
		
		System.out.print("number of cheers? ");
		int cheersToPrint = IO.readInt( );
		System.out.print("number of hips per cheer? ");
		int hipsPerCheer = IO.readInt( );
		// Fill in whatever goes here, if anything.
		// Fill in the following for statement.
		for(int j = 1; j <= cheersToPrint; j++){
			// Fill in whatever goes here, if anything.
			// Fill in the following for statement.
			for(int k = 1; k <= hipsPerCheer; k++){
				// Fill in whatever goes here, if anything.
				IO.outputStringAnswer("Hip");
			}
			// Fill in whatever goes here, if anything.
			IO.outputStringAnswer("Hurray!");
		}
		// Fill in whatever goes here, if anything.
	}
}