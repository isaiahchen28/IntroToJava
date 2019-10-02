
public class LetterFrequency {

	public static void main(String[] args) {
		System.out.print("Enter string: ");
		String s = IO.readString();
		String phrase = s.toLowerCase();
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		// outer loop iterates over alphabet
		for (int i = 0; i < alphabet.length(); i++) {
			char letter = alphabet.charAt(i); // alphabet letter
			int count = 0;
			// inner loop iterates over string s
			for (int k = 0; k < phrase.length(); k++) {
				if (letter == phrase.charAt(k)) {
					count++;
				}
			}
			if (count >= 1) {
				System.out.println(letter + ": " + count);
			}
		}
		
		
	}

}
