public class Square extends Shape{

    private int side;
    
    public Square(int centerX, int centerY, int side){
	super(centerX, centerY);
	this.side = side;
    }

    public double area( ){
	return side * side;
    }
}
