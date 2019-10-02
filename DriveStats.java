
public class DriveStats{

	public static void main(String [ ] args){
	
		double [ ] x1 = {1.0, 4.0, 7.0};
		System.out.println(Stats.mean(x1));
		System.out.println(Stats.variance(x1));
		System.out.println(Stats.standardDeviation(x1));
    }
}