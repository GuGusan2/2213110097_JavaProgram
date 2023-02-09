
public class Rectangle extends Shape{

	private double width;
	private double length; 
	
	public Rectangle(double width, double length, String color) {
		super(color);
		this.width = width;
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getLength() {
		return length;
	}
	
	@Override
	public double getArea() {
		return getWidth()*getLength();
	}

	//return string in form "Rectangle[width = , length = , color = ]"
	@Override
	public String toString() {
		return "Rectangle[width = "+getWidth()+" , "+getLength()+" , "+super.toString()+"]";
	}

}
