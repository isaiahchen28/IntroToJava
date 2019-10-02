// this program reads grades until a  sentinal of 0
// it prints the grades divided by the maximum grade in the input
// complains and exits if > MAXNUNGRADES grades

public class ScaleGradeCheckFE{
    public static void main(String[ ] args){
	final int MAXNUNGRADES = 5;
	int[ ] grades = new int[MAXNUNGRADES];
	int grade;
	int place=0;
	int maxGrade = 0;
	double dmax;

	// Read grades and find max
	grade = IO.readInt( );
	while (grade > 0){
	    if (place  >= MAXNUNGRADES){
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
	//print scaled grades.  Note the  for each
	for (int oneGrade: grades){
	    System.out.println(oneGrade/dmax);
	}
    }
}
