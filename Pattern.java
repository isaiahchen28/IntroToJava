public class Pattern {

	/* A pattern is made out of 2 Rectangle4's.  Variables recta
	 * and rectb hold references to these two Rectangle4's.
	 * They are both instance variables */
	
	Rectangle4 recta;
	Rectangle4 rectb;
		
	public Pattern(Rectangle4 ra, Rectangle4 rb){
	    this.recta = ra;   // "this." can be omitted here
	    this.rectb = rb;   //  also here
	}
	
	public int area( ){
	    return this.recta.area( ) + this.rectb.area( );  // the "this."s can be omitted here
	}
}
