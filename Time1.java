// version 1 of class Time.  Represents a time of day.  Uses
// instance variables hours and minutes.  Copy this file to
// Time.java to use.  cf Time2.java

public class Time1{
    // fields
    private int hour;
    private int minute;
    
    // constructors
    public Time1(Time1 other){
	this.hour = other.hour;
	this.minute = other.minute;
    }
    public Time1(int h, int m){
	this.setHour(h);
	this.setMinute(m);
    }
    public Time1(int m){
	this.setHour(m / 60);
	this.setMinute(m % 60);
    }

    // getter and setter methods
    public void setHour(int h){
	this.hour = h;
    }
    public void setMinute(int m){
	this.minute = m;
    }
    public int getHour( ){
	return this.hour;
    }
    public int getMinute( ){
	return this.minute;
    }
    public void print( ){
	if (this.minute < 10){
	    System.out.println(this.hour + ":0" + this.minute);
	} else {
	    System.out.println(this.hour + ":" + this.minute);
	}
    }
    public void advance(int h, int m){
	this.hour = this.hour + h;
	this.minute = this.minute + m;
		
	// carry blocks of 60 minutes into hours field
	this.hour += this.minute / 60;
	this.minute = this.minute % 60;
    }
    public int compareTo(Time1 other){
	if (this.hour != other.hour){
	    return this.hour - other.hour;
	} else {
	    return this.minute - other.minute;
	}
    }
}

