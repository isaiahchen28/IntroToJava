
public class Fine{

	public static void main(String[] args) {

    	System.out.println("Days late?");
    	int days = IO.readInt();
    	System.out.println("Book cost?");
    	int cost = IO.readInt();
    	int fee;
    	if (days <= 0) {
    		fee = 0;
    	}
    	else if (days <= 7) {
    		fee = days*10;
    	}
    	else if (days <= 90) {
    		fee = ((days-7)*20)+70;
    	}
    	else {
    		fee = cost+1000;
    	}
    	IO.outputIntAnswer(fee);
    }
}