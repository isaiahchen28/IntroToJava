
public class StarPattern{ 

	public static void main(String [ ] args){
        
		for (int i= 1; i<3; i++){
            printNStars(i);
        }
        printNStars(3);
    }

    public static void printNStars(int n){
        
    	IO.outputStringAnswer(nTimesChar(n, '*'));
    }

    public static String nTimesChar(int n, char c){
        
    	String result = "";
        for (int i=0; i<n; i++){
            result = result + c;
        }
        return result;
    }
}