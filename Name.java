public class Name{
    
    String personal;
    String family;

    public Name(String personal, String family){
	this.personal = personal;
	this.family = family;
    }

    public String toString( ){
	return personal + " " + family;
    }

    public boolean sameFamily(Name other){
	return family.equals(other.family);
    }

    public static void main(String [ ] args){
	Name n1 = new Name("Bob", "Jones");
	Name n2 = new Name("Sue", "Jones");
	Name n3 = new Name("John", "Smith");
	System.out.println(n1);
	System.out.println(n1.sameFamily(n2));
	System.out.println(n1.sameFamily(n3));
    }
}