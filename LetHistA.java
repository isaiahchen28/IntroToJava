// How many times does each lower case letter appear in a string?
// version using an array of counters, no nested loops.
// F13
public class LetHistA{

    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    static final int ALPHLENGTH = ALPHABET.length( );

    public static void main(String [ ] args){
	String line = IO.readString();
	// create and initialize array of character counts
	int [ ] counts = new int [ALPHLENGTH];
	// the array elements are automatically inited to 0
	// now count characters
	for (int index = 0; index < line.length( ); index ++){
	    int alphPlace = ALPHABET.indexOf(line.charAt(index));
	    if (alphPlace >= 0){ // if char at index of line is in ALPHABET
		counts[alphPlace]++;
	    }
	}
	// print counts
	for (int alphPlace = 0; alphPlace < ALPHABET.length( ); alphPlace ++){
	    IO.outputStringAnswer(ALPHABET.charAt(alphPlace)+" "+counts[alphPlace]);
	}
    }
}
