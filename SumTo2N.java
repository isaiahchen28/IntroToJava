// Reads a number num, adds up the numbers from num up to but not including 
// 2*num, and prints the result.

public class SumTo2N{
	
	public static void main(String [ ] args){
		
		System.out.print("type num: ");
		int num = IO.readInt();
		// Declare and initialize your summary variable(s) here.
		int sum = 0;
		for(int k = num; k < 2*num; k++){
			// Update your summary variable(s) here.
			sum = sum+k;
		}
		// Print the result here.
		IO.outputIntAnswer(sum);
   	}
}