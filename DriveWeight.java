public class DriveWeight{  // do not change anything in this class and do not turn it in

    public static Weight readWeight( ){
	int lbs = IO.readInt( );
	int ozs = IO.readInt( );
	return new Weight(lbs, ozs);
    }

    public static void main(String [ ] args){
	Weight w1 = readWeight( );
	Weight w2 = readWeight( );
	Weight w3 = w1.sum(w2);
	System.out.println("the sum is " + w3.getPounds( ) + " pounds, " + w3.getOunces( )
			   + " ounces = " + w3.getTotalOunces( ) + " ounces");
    }
}

