import java.util.*;
import java.text.*;

public class StockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat fm = new DecimalFormat("#,###.00");
		Product[] pd = new Product[4];
		// String[] productList = new String[4];
		double total = 0;
		for (int i = 0; i < pd.length; i++) {
			pd[i] = new Product();
			System.out.print("Input product Id    : ");
			pd[i].setId(scan.next());
			System.out.print("Input product Unit  : ");
			pd[i].setUnit(scan.nextInt());
			System.out.print("Input priduct Price : ");
			pd[i].setPrice(scan.nextDouble());
			System.out.println();
			if (!pd[i].checkStock()) {
				System.out.print("Input product Id ,again    : ");
				pd[i].setId(scan.next());
				System.out.print("Input product Unit ,again  : ");
				pd[i].setUnit(scan.nextInt());
				System.out.print("Input priduct Price ,again : ");
				pd[i].setPrice(scan.nextDouble());
				System.out.println();
			}
		} // end for
		System.out.println("-------------------------------------------");

		for (Product _pd : pd) {
			System.out.println(
					"Product ID : " + _pd.getId() + ", Total price = " + fm.format(_pd.calculate()) + " baht.");
			total += _pd.calculate();
		}
		System.out.println("-------------------------------------------");
		System.out.println("Total price of all products is " + fm.format(total) + " baht.");
	}

}
