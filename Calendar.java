
public class Calendar{
    
    public static boolean addEvent(String [ ] calendar, String event, int date){
    	
    	if (date < 1 || date > 31) {
    		return false;
    	}
    	else {
    		if (calendar[date] != null) {
    			return false;
    		}
    		else {
    			calendar[date] = event;
    			return true;
    		}
    	}
    }

    // bug in printCalendar fixed 7/4/2014 LS
    public static void printCalendar(String [ ] calendar){
    	
    	for (int d = 1; d < 32; d++){  // calendar[0] is not used
    		IO.outputStringAnswer(d + " " + calendar[d]);
		}
    }
    
    public static void main(String [ ] args){
    	
    	// 31 days + 1 unused element = 32 elements in a calendar array
    	String [ ] calendar1 = new String [ 32 ];  
    	boolean result1 = addEvent(calendar1, "party", 5);
    	IO.outputBooleanAnswer(result1);
    	printCalendar(calendar1);
    	// add your test calls here
    	boolean result2 = addEvent(calendar1, "travel", 0);
    	IO.outputBooleanAnswer(result2); // should return false
    	boolean result3 = addEvent(calendar1, "grocery store", 1);
    	IO.outputBooleanAnswer(result3); // should return true and put event on day 1
    	boolean result4 = addEvent(calendar1, "class", 31);
    	IO.outputBooleanAnswer(result4); // should return true and put event on day 31
    	boolean result5 = addEvent(calendar1, "presentation", 32);
    	IO.outputBooleanAnswer(result5); // should return false
    	boolean result6 = addEvent(calendar1, "other party", 5);
    	IO.outputBooleanAnswer(result6); // should return false since day 5 already has event planned
    	printCalendar(calendar1);
    }
}