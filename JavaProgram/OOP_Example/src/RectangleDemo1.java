
import javax.swing.JOptionPane;

public class RectangleDemo1 {

	public static void main(String[] args) {
		double width = Double.parseDouble(JOptionPane.showInputDialog("Input Width : "));
		double length = Double.parseDouble(JOptionPane.showInputDialog("Input Length : "));
		String color = JOptionPane.showInputDialog("Input Color : ");
		
		Rectangle rectangle = new Rectangle(width, length, color);
		JOptionPane.showMessageDialog(null, rectangle+"\nArea of Rectangle is "+rectangle.getArea());
	}

}
