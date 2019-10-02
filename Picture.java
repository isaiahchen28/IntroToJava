public class Picture{

    private Shape [ ] shapes;
    private int numShapes;

    public Picture(int maxShapes){
	shapes = new Shape [maxShapes];
	numShapes = 0;
    }

    public void addShape(Shape shape){
	shapes[numShapes] = shape;
	numShapes ++;
    }

    public void up(int distance){
	for  (int i = 0; i < numShapes; i++){
	    shapes[i].up(distance);
	}
    }

    public double area( ){
	double sum = 0.0;
	for  (int i = 0; i < numShapes; i++){
	    sum = sum + shapes[i].area( );
	}
	return sum;
    }

    public static void main(String [ ] args){
	Picture p1 = new Picture(5);
	Square sq1 = new Square(1, 1, 3);
	Circle c1 = new Circle(5, 5, 2);
	p1.addShape(sq1);
	p1.addShape(c1);
	p1.up(10);
	System.out.println(p1.area( ));
    }
}
