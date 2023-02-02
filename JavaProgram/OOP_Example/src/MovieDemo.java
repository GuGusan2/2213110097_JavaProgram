import java.util.Scanner;

public class MovieDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input movie id     : ");
		String id = scan.nextLine();
		System.out.print("Input movie name   : ");
		String Mname = scan.nextLine();
		System.out.println();
		System.out.print("Input director name     : ");
		String dName = scan.nextLine();
		System.out.print("Input director e-mail   : ");
		String email = scan.nextLine();
		System.out.print("Input director gender   : ");
		char gender = scan.next().toLowerCase().charAt(0);
		
		while(!(gender == ('m')||gender == ('f'))){
			System.out.print("Input director gender, again  : ");
			gender = scan.next().toLowerCase().charAt(0);
		}
		System.out.println();
		
		System.out.print("Input movie theater no. :  ");
		int theater = scan.nextInt();
		
		while(theater < 1 || theater >15) {
			System.out.print("Please input 1 - 15 only  : ");
			theater = scan.nextInt();
		}
		System.out.println();
		
		Theater mv = new Theater(id,Mname,new Director(dName, email,gender),theater);
		System.out.println(mv);
		

	}

}
