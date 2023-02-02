import javax.swing.JOptionPane;

public class Shop100Baht {

	public static void main(String[] args) {
		Product1 arnupad = new Product1();
		
		int check = JOptionPane.showConfirmDialog(null, "Is the run on Pattanakarn Branch?","Run Program",JOptionPane.YES_NO_OPTION);
		
		if(check ==0) {
			arnupad = new PattanakarnBranch();
		}
		
		
		arnupad.setUnit(Integer.parseInt(JOptionPane.showInputDialog("Input the number of product:"))); 
		JOptionPane.showMessageDialog(null, arnupad);
		

	}

}
