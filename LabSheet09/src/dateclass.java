
public class dateclass {
	private int year; 
	private int month;
	private int day;
	
	public void Date(int year,int month, int day){
	this.year = year;
	this.month = month;
	this.day = day;
	}
	public int getYear() {
		return this.year;
	}
	public int getMonth() {
		return this.month;
	}
	public int getDay() {
		return this.day;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setMonth(int Month) {
		this.month = Month;
	}
	public void setDay(int Day) {
		this.day = Day;
	}
	public String toString() {
		return String.format("%02d/%2d/%4d", month,day,year);
	}
	public void setDate(int year,int month,int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
}

