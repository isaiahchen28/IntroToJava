
public class Stats{

	public static double mean(double [ ] x){

		double sum = 0;
		for (int i = 0; i < x.length; i++){
			sum = sum+x[i];
		}
		double average = sum/x.length;
		return average;
	}

	public static double variance(double [ ] x){
	
		double sumV = 0;
		for (int i = 0; i < x.length; i++){
			sumV = sumV+Math.pow((x[i]-mean(x)), 2.0);
		}
		double var = sumV/x.length;
		return var;
	}

	public static double standardDeviation(double [ ] x){
	
		double stdDev = Math.sqrt(variance(x));
		return stdDev;
	}

	public static void main(String [ ] args){

		double [ ] x1 = {1.0, 4.0, 7.0};
		IO.outputDoubleAnswer(mean(x1));
		IO.outputDoubleAnswer(variance(x1));
		IO.outputDoubleAnswer(standardDeviation(x1));
	}
}