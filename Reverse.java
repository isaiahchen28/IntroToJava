// reads 4 numbers, prints them in reverse order
public class Reverse{
    public static void main(String [ ] args){
	int numNums = 4;
	int[ ] nums = new int [numNums];
	for (int j = 0; j<numNums; j++){
	    nums[j] = IO.readInt( );
	}
	for (int j = numNums-1; j>=0; j--){
	    IO.outputIntAnswer(nums[j]);
	}
    }
}