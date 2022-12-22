import java.util.*;

public class TestStudent {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many student in classroom : ");
		int student = scan.nextInt();
		Student[] std = new Student[student]; // Define Array Object
		System.out.println();
		for (int i = 0; i<std.length ;i++) {
			std[i] = new Student(); // Declare array object ,call all of method student()
			System.out.println("INPUT INFORMATION OF STUDENT "+(i+1));
			System.out.println("-------------------------------");
			System.out.print("Input student name : ");
			std[i].setName(scan.next());
			System.out.print("Input student score : ");
			std[i].setScore(scan.nextInt());
			System.out.println("-------------------------------");
			while (!std[i].checkScore()) {
				System.out.print("Input student score, again: ");
				std[i].setScore(scan.nextInt());
			} // end while
			System.out.println();
		} // end for
		System.out.println();
		System.out.println("LIST OF PASS STUDENT (>=50)");
		System.out.println("------------------------------");
		/*
		 * for(int i=0 ; i<std.length ; i++) { if(std[i].isPass()) {
		 * System.out.println(">> "+std[i].getName()+" ("+std[i].getScore()+") "); }
		 * }//end for
		 */
		for (Student STD : std) {
			if (STD.isPass()) {
				System.out.println(">> " + STD.getName() +" get grade "+ STD.findGrade(STD.getScore()));
			}
		}

	}// end main()

}


