public class NameM extends Name{

    String middle;
    
    public NameM(String personal, String middle, String family){
	super(personal, family);
	this.middle = middle;
    }

    public String toString( ){
	return personal + " " + middle + " " +family;
    }

    public static void main(String [ ] args){
	NameM n1 = new NameM("John", "Quincy", "Adams");
	NameM n2 = new NameM("Sue", "Ann", "Adams");
	NameM n3 = new NameM("Steven", "George", "Smith");
	System.out.println(n1);
	System.out.println(n1.sameFamily(n2));
	System.out.println(n1.sameFamily(n3));
    }
}


    