
public class Author {

	private String name;
	private String email;
	private char gender;
	
	public Author() {
		name = email = "";
		gender = ' ';
	}
	
	public Author(String name, String email) {
		this.name = name;
		this.email = email;
		gender = ' ';
	}
	
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getGenderName() {
		if(Character.toString(this.gender).equalsIgnoreCase("m")) {
			return "Male";
		} else if(Character.toString(this.gender).equalsIgnoreCase("f")) {
			return "Female";
		}
		return "";
	}
	
	public String toString() {
		return "Author name: "+getName()+" ("+getEmail()
		       +";" +getGenderName() + ")"; 
	}
	
	public String displayData() {
		return getName()+" ("+getEmail() +")"; 
	}
	
}
