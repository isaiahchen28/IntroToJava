public class EnterQuiz{
    public static void main(String[ ] args){
	int[ ] grades = new int[10];
	for(int i=0; i<10; i++){ 
	    grades[i]=0;
	}
	System.out.println("Quiz number or -1 for end");
	int quiznum = IO.readInt( );
	while (quiznum>=0){
	    System.out.println("grade for quiz "  + quiznum );
	    grades[quiznum] = IO.readInt( );
	    System.out.println("Quiz number or -1 for end");
	    quiznum = IO.readInt( );
	}
	System.out.println(" ");
	for(int i=0; i<10; i++){ 
	    System.out.println(i + "  " + grades[i]);
	}
    }
}

