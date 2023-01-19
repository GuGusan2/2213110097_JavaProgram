
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
	}
	
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getGenderName() {
		if (Character.toUpperCase(this.gender) == 'M') {
			return "Male";
		}if (Character.toUpperCase(this.gender) == 'F') {
			return "Female";
		}
		return "";

	}// end of getGenderName()
	
	public String toString() {
		return "Author name: "+ getName() + " (" + getEmail() + ";" + getGenderName() + ")";
	}
}
