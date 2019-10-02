public class Rectangle3 {

/* width and height below are declared outside of any
 * methods, so they are instance variables.  Each 
 * Rectangle3 object has its own copy of width and height.  
 * To refer, eg, to a specific width, you need to know 
 * which object's copy of width you are referring to.
 * If you don't say which width, Java assumes this.width.
 */
	int width;
	int height;
	
	/*The following method is a constructor.  It is called
	 * by new to initialize the new object's instance
	 * variables.  In a constructor, the variable this
	 * holds a reference to the newly created object.
	 * Variables wdth and ht are parameters of this method */
	public Rectangle3(int wdth, int ht){
		this.width = wdth;
		this.height = ht;
	}
	
	/*The following version of area is not static.  To 
	 * call it you send the message "area" to an object
	 * of class Rectangle3.  While doing that call, the 
	 * variable this refers to that object*/
	int area( ){
		return this.width * this.height;
	}
	
	/*Variable rb is a local variable of the main method.*/
	public static void main(String [ ] args) {
		Rectangle3 rb = new Rectangle3(4,5);
		System.out.println("Rectangle3");
		System.out.println("width= "+rb.width+", " +
				"height= "+rb.height);
		System.out.println("area= "+rb.area( ));
	}
}
