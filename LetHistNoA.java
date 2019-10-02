// How many times does each lower case letter appear in a string?
// version using an array of counters, no nested loops.
// Uses nested if instead of an array
public class LetHistNoA{

    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    static final int ALPHLENGTH = ALPHABET.length( );

    public static void main(String [ ] args){
	String line = IO.readString();
	// create and initialize character counts
	int counta = 0;
	int countb = 0;
	int countc = 0;  // etc ...
	int countz = 0;
	// now count characters
	for (int index = 0; index < line.length( ); index ++){
	    int alphPlace = ALPHABET.indexOf(line.charAt(index));
	    if (alphPlace == 0){
		counta++;
	    } else if (alphPlace == 1){
		countb++;
	    } else if (alphPlace == 2){  // etc
		countc++;
	    } else if (alphPlace  == 26){
		countz++;
	    }
	}
	// print counts
	IO.outputStringAnswer("a "+counta);
	IO.outputStringAnswer("b "+countb);
	IO.outputStringAnswer("c "+countc); // etc ...
	IO.outputStringAnswer("z "+countz);
    }
}
