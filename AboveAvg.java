// read grades, print those above the average of all grades read
public class AboveAvg{
    public static void main(String [ ] args){

	int numGrades = IO.readInt( );
	if (numGrades <= 0){
	    IO.reportBadInput( );
	} else {
	    int[ ] grade = new int [numGrades];
	    int sum = 0;
	    for (int j = 0; j<numGrades; j++){
	        grade[j] = IO.readInt( );
	        sum += grade[j];
	    }
	    // print grades above average
            double avg = sum / (double) numGrades;
	    for (int j = 0; j < numGrades; j++){
 	        if (grade[j] > avg){
	            IO.outputIntAnswer(grade[j]);
	        }
	    }
	}
    }
}