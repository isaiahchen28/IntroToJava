
public class TwoSmall{

	public static void main(String[] args) {

    	int firstNumber = IO.readInt();
    	if (firstNumber <= 0) {
    		IO.reportBadInput();
    	}
    	else {
    		int secondNumber = IO.readInt();
    		if (secondNumber <= 0) {
    			IO.reportBadInput();
    		}
    		else {
    			int smallestNumber = Math.min(firstNumber, secondNumber);
    			int secondSmallestNumber = Math.max(firstNumber, secondNumber);
    			int number = 1;
    			while (number != -1) {
    				number = IO.readInt();
    				if (number < smallestNumber && number > 0) {
    					secondSmallestNumber = smallestNumber;
    					smallestNumber = number;
    				}
    				else if (number < secondSmallestNumber && number > 0) {
    					secondSmallestNumber = number;
    				}
    				else if (number <= 0 && number != -1) {
    					IO.reportBadInput();
    				}
    			}
    			IO.outputIntAnswer(smallestNumber);
    			IO.outputIntAnswer(secondSmallestNumber);
    		}
    	}
    }
}