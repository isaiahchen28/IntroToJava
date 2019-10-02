public class RevInPlace{
    public static void main(String [ ] args){
	int numNums = 4;
	int[ ] nums = new int [numNums];
	for (int j = 0; j<numNums; j++){
	    nums[j] = IO.readInt( );
	}

	int[ ] rnums = new int [numNums];
	for (int j = 0; j<numNums; j++){
	    rnums[j] = nums[ numNums - 1 - j];
	}

	for (int j = 0; j<numNums; j++){
	    IO.outputIntAnswer(rnums[j]);
	}

	IO.outputStringAnswer("------");

	for (int j = 0; j<numNums/2; j++){
	      int temp = nums[numNums - 1 - j];
	      nums[numNums - 1 - j] = nums[j];
	      nums[j] = temp;
	}


	for (int j = 0; j<numNums; j++){
	    IO.outputIntAnswer(nums[j]);
	}
    }
}