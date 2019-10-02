
public class Weight{

	int totalOunces;

	public Weight(int pounds, int ounces){
		this.totalOunces = pounds*16 + ounces;
	}
	
	public int getPounds( ){
		return this.totalOunces/16;
	}

	public int getOunces( ){
		return this.totalOunces%16;
	}
	
	public int getTotalOunces( ){
		return this.totalOunces;
	}

	public Weight sum(Weight other){
		int sumLbs = this.totalOunces/16 + other.totalOunces/16;
		int sumOzs = this.totalOunces%16 + other.totalOunces%16;
		if (sumOzs >= 16){
			sumOzs = sumOzs - 16;
			sumLbs = sumLbs + 1;
		}
		return new Weight(sumLbs, sumOzs);
	}
}
