import java.util.*;

public class Lab504 {

	static String fullname;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name, separated by a space.\n:");
		fullname = scan.nextLine();
		int index = fullname.indexOf(" ");
		String firstname = fullname.substring(0,index);
		System.out.println(abbreviatName(fullname)+firstname);      

	}
	public static String abbreviatName(String fullname) {
		String letter = "";
		for(int i = 0;i<fullname.length() ;i++ ) {
			if(fullname.charAt(i) == ' ') {
                letter = letter+fullname.charAt(i+1);
                letter = letter.toUpperCase()+".";
			}
		}
		return letter;
	}

}
