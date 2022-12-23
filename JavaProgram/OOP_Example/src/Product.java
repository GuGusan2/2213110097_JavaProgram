
public class Product {
	private String id;
	private int unit;
	private double price;

	public void setId(String ID) {
		id = ID;
	}

	public String getId() {
		return id;
	}

	public void setUnit(int UNIT) {
		unit = UNIT;
	}

	public int getUnit() {
		return unit;
	}

	public void setPrice(double PRICE) {
		price = PRICE;
	}

	public double getPrice() {
		return price;
	}

	public double calculate() {
		return unit * price;
	}

	public boolean checkStock() {
		return (unit > 0 && price > 0) ? true : false;
	}

	public String checkproduct(int UNIT) {
		return (unit < 5) ? "LOW" : (unit >= 5 && unit <= 50) ? "NORMAL" : "HIGH";
	}
}
