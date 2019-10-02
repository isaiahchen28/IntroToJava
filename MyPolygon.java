
public class MyPolygon{
	int numsides;
	double length;
	double[] sides;

	// constructor - initializes a MyPolygon to have numsides 
	// sides, each of length 0
	public MyPolygon(int numsides){
		this.numsides = numsides;
		length = 0.0;
		sides = new double[numsides];
		for(int j = 0; j < numsides; j++){
			sides[j] = length;
		}
	}

	// sets length of given side to length. side is a number 
	// from 0 (inclusive) up to number of sides (exclusive)
	public void setSideLength(int side, double length){
		if(side >= 0 && side < numsides && length > 0){
			sides[side] = length;
		}
	}

	// returns sum of all the side lengths 
	public double getPerimeter(){
		double perimeter = 0.0;
		for(int j = 0; j < numsides; j++){
			perimeter = perimeter+sides[j];
		}
		return perimeter;
	}
}