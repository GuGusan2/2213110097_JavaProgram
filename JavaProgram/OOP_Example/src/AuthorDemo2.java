import java.util.Scanner;
public class AuthorDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name="",email="";
		Author author = new Author(name,email);
		String[] msg = new String[4];
		int i = 1;
		for(i =0; i<4; i++) {
			System.out.print("Information Author "+(i+1));
			System.out.println("\n-------------------------------------------------");
			System.out.print("Input author name    : ");
			name = scan.nextLine();
			System.out.print("Input author email   : ");
			email = scan.nextLine();
			System.out.println("\n-------------------------------------------------");
			author = new Author(name,email);
			msg[i] = author.displayData();
		}
		i=1;
		for(String _msg : msg) {
			System.out.println(i + ". "+_msg);
			i++;
		}
		

	}

}
