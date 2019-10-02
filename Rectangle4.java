public class Rectangle4 {

/* width and height below are declared outside of any
 * methods, so they are instance variables.  Each 
 * Rectangle4 object has its own copy of width and height.  
 * To refer, eg, to a specific width, you need to know 
 * which object's width variable you are referring to.
 * If you don't say which width, Java assumes this.width.
 */
	int width;
	int height;
	
	/*The following method is a constructor.  It is called by new
	 * to initialize the new object's instance variables.  In a
	 * constructor, the variable this holds a reference to the
	 * newly created object.  Variables width and height are parameters
	 * of this method */
	public Rectangle4(int width, int height){
	    this.width = width;      // this. is needed here to refer to the instance
	    this.height = height;    //     variables.  Without this. width would refer
                                     //     to the parameter width, not the instance 
                                     //     variable. The same for height
	}
	
	/*The following version of area is not static.  To 
	 * call it you send the message "area" to an object
	 * of class Rectangle4.  While doing that call, the 
	 * variable this refers to that object*/
	int area( ){
		return this.width * this.height;
	}
	

}
