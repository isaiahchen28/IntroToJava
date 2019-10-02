public class Circle extends Shape{

    private int radius;
    
    public Circle(int centerX, int centerY, int radius){
	super(centerX, centerY);
	this.radius = radius;
    }

    public double area( ){
	return Math.PI * radius * radius;
    }
}
