
public class PersonalInfo {

	private Person name;
	private Date dDay;
	private int personID;
	
	//  Default Constructor
	public PersonalInfo() {
		name = new Person();
		dDay = new Date();
		personID = 0; //การสุ่ม
	}
	
	//Constructor with parameter
	public PersonalInfo(String first, String last,int month,int day, int year ,int ID) { 
		//initialize the object name
		name = new Person(first,last);
		//initialize the object dDay
		dDay = new Date(month,day,year);
		
		personID = ID;
		
	}
	
	public void setPersonalInfo(String first, String last,int month,int day, int year ,int ID) {
		name.setName(first,last);
		dDay.setDate(month,day,year);
		personID = ID;		
	}
	
	public String toString() {
		return "Name: " +name.toString() +"\nDate of birth: "+dDay.toString()+"\nPersonal ID: "+personID;
	}

}
