public class PatternDriver{
	static public void main(String [ ] args){
		Rectangle4 ra = new Rectangle4(4, 5);
		Rectangle4 rb = new Rectangle4(6, 7);
		Pattern p = new Pattern(ra, rb);
		int parea = p.area( );
		System.out.println("Pattern");
		System.out.println("area= "+parea);
	}
}
