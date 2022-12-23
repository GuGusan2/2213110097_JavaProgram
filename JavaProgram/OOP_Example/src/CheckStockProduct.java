import java.util.Scanner;

public class CheckStockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		System.out.print("How many product list in stock : ");
		int list = scan.nextInt();
		Product[] pd = new Product[list];
		System.out.println();
		for (int i = 0; i < pd.length; i++) {
			pd[i] = new Product();
			System.out.print("Input product Id    : ");
			pd[i].setId(scan.next());
			System.out.print("Input product Unit  : ");
			pd[i].setUnit(scan.nextInt());
			System.out.println();

		} // end for
		System.out.println("-------------------------------------------");
		System.out.println("List of product in 'LOW' status.");
		System.out.println("-------------------------------------------");
		for (Product _pd : pd) {
			if (_pd.checkproduct(_pd.getUnit()).equalsIgnoreCase("low"))
				System.out.println(">> " + _pd.getId() + " has " + _pd.getUnit() + " units");
		}
		System.out.println("-------------------------------------------");
		System.out.println("List of product in 'NORMAL' status.");
		System.out.println("-------------------------------------------");
		for (Product _pd : pd) {
			if (_pd.checkproduct(_pd.getUnit()).equalsIgnoreCase("normal"))
				System.out.println(">> " + _pd.getId() + " has " + _pd.getUnit() + " units");
		}
		System.out.println("-------------------------------------------");
		System.out.println("List of product in 'HIGH' status.");
		System.out.println("-------------------------------------------");
		for (Product _pd : pd) {
			if (_pd.checkproduct(_pd.getUnit()).equalsIgnoreCase("high"))
				System.out.println(">> " + _pd.getId() + " has " + _pd.getUnit() + " units");
		}
	}// end main()

}
