// version 2 of class Time.  Represents a time of day. Uses instance
// variable totalMins.  Copy this file to Time.java to use
// cf Time1.java

public class Time2{

    // fields
    private int totalMins;

    // constructors
    public Time2(Time2 other){
	this.totalMins = other.totalMins;
    }
    public Time2(int h, int m){
	this.totalMins=60*h+m;
    }
    public Time2(int m){
	this.totalMins = m;
    }
	
    // getter & setter methods	
    public void setHour(int h){
	this.totalMins = h*60 + this.getMinute();
    }
    public void setMinute(int m){
	this.totalMins = m + 60 * this.getHour();
    }
    public int getHour( ){
	return this.totalMins / 60;
    }
    public int getMinute( ){
	return this.totalMins % 60;
    }

    // other methods
    public void print( ){
	if (this.getMinute() < 10){
	    System.out.println(this.getHour() + ":0" + this.getMinute());
		} else {
	    System.out.println(this.getHour() + ":" + this.getMinute());
	}
    }
    public void advance(int h, int m){
	this.totalMins = (this.totalMins + h * 60 + m);
    }
    public int compareTo(Time2 other){
	return this.totalMins - other.totalMins;
    }
}
