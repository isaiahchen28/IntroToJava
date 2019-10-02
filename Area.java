
public class Area{

    public static void main(String [] args){
	
    	System.out.println("Type length of rectangle: ");
    	int length = IO.readInt();
    	if (length < 0){
    		IO.reportBadInput();
    		return;
    	}
    	System.out.println("Type width of rectangle: ");
    	int width = IO.readInt();
    	if (width < 0){
    		IO.reportBadInput();
    		return;
    	}
    	System.out.println("Type height of room: ");
    	int height = IO.readInt();
    	if (height < 0){
    		IO.reportBadInput();
    		return;
    	}
    	int area = rectangleArea(length, width);
    	IO.outputIntAnswer(area);
    	int perimeter = rectanglePerimeter(length, width);
    	IO.outputIntAnswer(perimeter);
    	int wallA = wallArea(length, width, height);
    	IO.outputIntAnswer(wallA);
    }
    
    public static int rectangleArea(int length, int width){
	
    	int area = length*width;
    	return area;
    }
    
    public static int rectanglePerimeter(int length, int width){
    	
    	int perimeter = 2*(length+width);
    	return perimeter;
    }
    
    public static int wallArea(int length, int width, int height){
    	int wallA = height*rectanglePerimeter(length, width);
    	return wallA;
    }
}