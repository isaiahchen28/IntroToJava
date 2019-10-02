public class Roster {
	Student [ ] students;
    int numStudents;
    int stopPoint;
    Course course;
	
    /**
     * The constructor for this class.
     * Initialize this roster to empty, i.e., holds no students,
     * with given stop point and course
     */
    public Roster(int stopPoint, Course course){
    	numStudents = 0;
    	students = new Student[numStudents];
    	this.stopPoint = stopPoint;
    	this.course = course;
    }
    
    /**
     * toString is a method every class has.  It returns a string 
     * that represents the object for printing
     */
    public String toString( ){
    	String res = "";
    	for(int j = 0; j < numStudents; j++){
    		res = res + "\n" + students[j].toString();
    	}
    	return course + " " + numStudents + "/" + stopPoint+res;
    }

    /**
     * isFull returns true if and only if the number of students in it is 
     * at the stopPoint
     */
    public boolean isFull( ){
    	if(numStudents == stopPoint){
    		return true;
    	}
    	else{
    		return false;
    	}
    }
	
    /**
     * add given student to this roster
     * if student already on roster or numStudents already == stopPoint, 
     * do not change roster and return false
     * @return true if successful, else false
     */
    public boolean addStudent(Student student){
    	if(numStudents == stopPoint || findStudent(student)){
    		return false;
    	}
    	else{
    		Student[]tempStudents = new Student[numStudents];
    		for(int j = 0; j < numStudents; j++){
    			tempStudents[j] = students[j];
    		}
    		students = new Student[numStudents+1];
    		for(int j = 0; j < numStudents; j++){
    			students[j] = tempStudents[j];
    		}
    		students[numStudents] = student;
    		numStudents++;
    		return true;
    	}
    }

    /**
     * returns true if and only if the student is on this roster.
     */
    public boolean findStudent(Student student){
    	for(int j = 0; j < numStudents; j++){
    		if(students[j].personalName.equalsIgnoreCase(student.personalName)
    			&& students[j].familyName.equalsIgnoreCase(student.familyName)){
    			return true;
    		}
    	}
    	return false;
    }

    /**
     * Remove given student from this roster. 
     * If student is not on this roster do not change roster and return false
     * @return true if successful, else false
     */
    public boolean dropStudent(Student student){
    	if(!findStudent(student)){
    		return false;
    	}
    	else{
    		Student[]tempStudents = new Student[numStudents];
    		for(int j = 0; j < numStudents; j++){
    			tempStudents[j] = students[j];
    		}
    		students = new Student[numStudents-1];
    		int counter = 0;
    		for(int j = 0; j < numStudents; j++){
    			if(tempStudents[j] != student){
    				students[counter] = tempStudents[j];
    				counter++;
    			}
    		}
    		numStudents--;
    		return true;
    	}
    }
}