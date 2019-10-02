
public class MyPolyDriver{

	public static void main(String[] args){
		MyPolygon p = new MyPolygon(3); // replace 3 with any number > 0
		p.setSideLength(0, 9.87);
		p.setSideLength(1, 10.0);
		p.setSideLength(2, 3.6);
		System.out.println(p.getPerimeter());
		
		// Square test
		MyPolygon p4 = new MyPolygon(4);
		p4.setSideLength(0, 34);
		p4.setSideLength(1, 34);
		p4.setSideLength(2, 34);
		p4.setSideLength(3, 34);
		// getPerimeter should return 136.0
		System.out.println(p4.getPerimeter());
		// Because a square cannot have a fifth side, a side with a negative index, or sides with negative length,
		// this code should return the same perimeter as above.
		p4.setSideLength(4, 10);
		p4.setSideLength(-1, 10);
		p4.setSideLength(3, -10);
		System.out.println(p4.getPerimeter());
		
		// Dodecagon test
		MyPolygon p12 = new MyPolygon(12);
		p12.setSideLength(0, 6);
		p12.setSideLength(1, 4);
		p12.setSideLength(2, 3);
		p12.setSideLength(3, 2);
		p12.setSideLength(4, 9);
		p12.setSideLength(5, 1);
		p12.setSideLength(6, 3);
		p12.setSideLength(7, 8);
		p12.setSideLength(8, 4);
		p12.setSideLength(9, 3);
		p12.setSideLength(10, 2);
		p12.setSideLength(11, 5);
		// getPerimeter should return 50.0
		System.out.println(p12.getPerimeter());
	}
}