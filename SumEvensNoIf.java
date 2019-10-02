// Adds up all the even numbers from 1 through a given number, but does
// so without testing numbers to see if they are even.

public class SumEvensNoIf{
	
	public static void main(String [ ] args){
		
		System.out.print("type num: ");
		int num = IO.readInt();
		// Fill in whatever goes here, if anything.
		int sum = 0;
		// Fill in the following for statement.
		for(int n = 2; n <= num; n+=2){
			// Fill in whatever goes here if anything.
			sum = sum+n;
		}
		// Fill in whatever goes here, if anything.
		IO.outputIntAnswer(sum);
	}
}