/* this program reads grades until a  sentinal of 0
   it prints the grades divided by the maximum grade in the input
   complains and exits if > MAXNUMGRADES grades
*/ 

public class ScaleGradeCheck{
    public static void main(String[ ] args){
	final int MAXNUMGRADES = 5;
	int[ ] grades = new int[MAXNUMGRADES];
	int grade;
	int place=0;
	int maxGrade = 0;
	double dmax;

	// Read grades and find max
	grade = IO.readInt( );
	while (grade > 0){
	    if (place  >= MAXNUMGRADES){
		IO.reportBadInput( );
		return;
	    }
	    grades[place] = grade;
	    if (grades[place]>maxGrade){
		maxGrade = grades[place];
	    }
	    place++;
	    grade = IO.readInt( );
	}
	dmax = maxGrade;
	//print scaled grades
	for (int i=0; i<place; i++){
	    System.out.println(grades[i]/dmax);
	}
    }
}
