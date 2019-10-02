public class TestRoster {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student s1 = new Student("John","Doe");
		Course c1 = new Course(198, 111);
		Roster r1 = new Roster(4, c1);
		System.out.println(r1);
		testAdd(r1, s1);
		testFull(r1);
		testFind(r1,s1);
		testDrop(r1,s1);
	}

    private static void testAdd(Roster r, Student s){
    	System.out.println(s.familyName+" "+r.addStudent(s));
    	System.out.println(r);
    }
    
    private static void testFull(Roster r){
    	System.out.println(r.isFull());
    	System.out.println(r);
    }
    
    private static void testFind(Roster r, Student s){
    	System.out.println(s.familyName+" "+r.findStudent(s));
    	System.out.println(r);
    }
    
    private static void testDrop(Roster r, Student s){
    	System.out.println(s.familyName+" "+r.dropStudent(s));
    	System.out.println(r);
    }
}