
public abstract class FictionBook implements Author_1,Book_1{
	private String author_name;
	private String email;
	private String title;
	private int publishYear;
	
	public FictionBook(String title,int publishYear) {
		this.title = title;
		this.publishYear = publishYear;
	}
	public void setAuthorName(String name) {
		this.author_name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean checkFormatName() {
		if(this.author_name.trim().contains(" ")) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return title;
	}
	
     
}
