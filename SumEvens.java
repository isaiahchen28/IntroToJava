// Adds up all the even numbers from 1 through a given number.

public class SumEvens{

	public static void main(String [ ] args){
		
    	System.out.print("type num: ");
		int num = IO.readInt();
		// Fill in whatever goes here, if anything.
		int sum = 0;
		for(int n = 1; n <= num; n++){
			// Fill in whatever goes here, if anything.
	    	if (n % 2 == 0){ // This tests if num is even.
				// Increment your summary variable(s) here.
				sum = sum+n;
			}	    
			// Fill in whatever goes here, if anything.
		}
		// Fill in whatever goes here, if anything.
		IO.outputIntAnswer(sum);
    }
}