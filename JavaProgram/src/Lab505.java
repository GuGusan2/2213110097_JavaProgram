import java.util.*;

public class Lab505 {

	public static void main(String[] args) {
		inputStudent();
	}
	
	public static void inputStudent() {
		Scanner scan = new Scanner(System.in);
		boolean check = false;
		System.out.print("Enter Student Id: ");
		String studentId = scan.nextLine();
		System.out.print("Enter Supject Id: ");
		String subjectId = scan.nextLine();
		isLength(studentId,subjectId);
		isITStudent(studentId);
		isITSubject(subjectId);
		displayData(check);

	}
	
	public static boolean isLength(String stuId,String subId) {
		if(stuId.length()==10 && subId.length()==7)
			return true;
		return false;
	}

    public static boolean isITStudent(String stuId) {
    	if(stuId.substring(0,7) == "221311")
    		return true;
    	return false;
	}
    
    public static boolean isITSubject(String subId) {
    	if(subId.substring(0,3) == "21")//not finish
    		return true;
    	return false;
		
	}
    
    public static void displayData(boolean check) {
		
	}
}
