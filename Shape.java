public class Shape{
    private int centerX;
    private int centerY;

    public Shape(int centerX, int centerY){
	this.centerX = centerX;
	this.centerY = centerY;
    }

   public void up(int distance){
	centerY  += distance;
    }

    public double area( ){
	return 0.0;
    }

}
