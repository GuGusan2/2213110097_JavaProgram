
public class Date {

	private int dMonth; //variable to store the month 
	private int dDay;  //variable to store the day
	private int dYear;  //variable to store the year
	
	// Default Constructor
	// Postcondition : dMonth=1;dDay=1;dYear=1900
	public Date() {
		dMonth = 1;
		dDay = 1;
		dYear = 1900;
	}
	
	//Constructor to set the date
	public Date(int month, int day, int year) {
		setDate(month,day,year);
	}
	
	//Method to set the date
	public void setDate(int month , int day , int year) {
		dMonth = month;
		dDay = day;
		dYear = year;
	}
	
	//Method to get month,day and year
	public int getMonth() {
		return dMonth;
	}
	
	public int getDay() {
		return dDay;
	}
	
	public int getYear() {
		return dYear;
	}
	
	public String toString() {
		return getMonth() +"-"+ getDay() +"-"+ getYear(); 
	}
	

}
