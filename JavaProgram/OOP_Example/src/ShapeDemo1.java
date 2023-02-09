import java.util.Scanner;

public class ShapeDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter radius : ");
		double radius = scan.nextDouble();
		System.out.print("Enter height : ");
		double height = scan.nextDouble();
		
		Circle circle = new Circle(radius,null);
		System.out.println("\nCircle["+circle+"]\n"+
				"Circle[area = "+circle.getArea()+"]\n");
		
		Cylinder cylinder = new Cylinder(radius, height);
		System.out.println("Cylinder["+cylinder+"]\n"+
		"Cylinder[area = " + cylinder.getArea()+"]\n"+
				"Cylinder[volume = "+cylinder.getVolume()+"]");

	}

}
