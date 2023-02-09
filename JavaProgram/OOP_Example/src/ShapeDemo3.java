import javax.swing.JOptionPane;

public class ShapeDemo3 {

	public static void main(String[] args) {
		Cylinder[] cylinders = new Cylinder[5];
		String cyString = "";
		String[] input = new String[5];
		double[] radius = new double[5];
		double[] height = new double[5];
		for(int i =0;i<5;i++) {
			input[i] = JOptionPane.showInputDialog(null,"Enter radius and height "+(i+1)
					+":");
			String[] data = input[i].split(" ");
			radius[i] = Double.parseDouble(data[0]);
			height[i] = Double.parseDouble(data[1]);
			cylinders[i] = new Cylinder(radius[i],height[i]);
		}	

		int i = 1;
		for(Cylinder _cy: cylinders) {
			JOptionPane.showMessageDialog(null,"Cylinder "+i+", "+"volume = "+_cy.getVolume());
			i++;
		}
		
	}

}
