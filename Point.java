// an instance of Point represents a point on a 2-Dimensional 
// integer grid. Point is an example of a class with its own
// .equals method
public class Point{
    int x;
    int y;

    public Point (int x, int y){
	this.x = x;
	this.y = y;
    }
    public String toString( ){
	return "<"+x+", "+y+">";
    }
    public boolean equals(Object o2){  // warning: also need define hashcode for this class
	if (o2 == null || !(o2 instanceof Point)) {return false;}
	Point p2 = (Point) o2;
	return (this.x == p2.x) && (this.y == p2.y);
    }
    public static void main(String [] args){
	Point p1 = new Point(1, 2);
	Point p2 = p1;
	Point p3 = new Point (1, 2);
	Point p4 = new Point(1, 3);
	System.out.println(p3 +" "+p4);
	System.out.println("==     "+(p1 == p2)+" "+ (p1 == p3) +" "+(p1 == p4));
	System.out.println(".equals  "+p1.equals(p2)+" "+ p1.equals(p3) +" "+p1.equals(p4));
    }
}
