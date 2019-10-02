// reads positive numbers until sentinel <= 0
// finds and prints any duplicates
// does not check for more data entered than array can hold
public class FindDups{
    public static void main(String[ ] args){
        int[ ] nums = new int[5];
        int place=0;
        int number = IO.readInt( );
        while (number > 0){
            nums[place] = number;
            place++;
	    if (place == 5){
		System.out.println("No more numbers.");
		break;
	    }
            number = IO.readInt( );
        }
        for(int i = 0; i < place-1; i++){
            for(int j = i + 1; j < place; j++){
                if (nums[i] == nums[j]){
                    IO.outputStringAnswer("duplicate " + nums[i] 
                        + " at " + i + " and " + j);
                }
            }
        }
    }
}
