import java.util.Scanner;

public class RectangleDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please Enter Width : ");
		double width = scan.nextDouble();
		System.out.print("Please Enter Length : ");
		double length = scan.nextDouble();		
		
		Rectangle2 rectangle = new Rectangle2(width, length);
		System.out.println(rectangle);
		System.out.println("Area is "+ rectangle);

	}

}
