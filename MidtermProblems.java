
public class MidtermProblems {

	public static void main(String[] args) {
		pattern(10);
	}

	public static void printShortest(){
		String[] s = new String[5];
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < 5; i++){
			s[i] = IO.readString();
			if(s[i].length() < min){
				min = s[i].length();
			}
		}
		for(int i = 0; i < 5; i++){
			if(s[i].length() == min){
				System.out.println(s[i]);
			}
		}
	}
	
	public static char triangleChar(int k){
		return "abcdefghij".charAt(k-1);
	}
	
	public static void pattern(int n){
		for(int i = n; i > 0; i--){ 					// responsible for each triangle
			for(int j = 0; j < i; j++){ 				// responsible for each row in the ith triangle
				for(int k = 0; k <= j; k++){ 			// responsible for each character in the row
					System.out.print(triangleChar(i));
				}
			System.out.println();	
			}
		}
	}
}
