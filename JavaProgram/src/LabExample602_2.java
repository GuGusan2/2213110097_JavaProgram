import javax.swing.*;

public class LabExample602_2 {

	static String[] deptName = { "Accounting", "HR", "Sales", "Innovation" };
	static boolean deptWasFound = false;

	public static void main(String[] args) {
		String dept = JOptionPane.showInputDialog("Enter a department name");

		for (int i = 0; i < deptName.length; i++) {
			if (dept.equalsIgnoreCase(deptName[i])) {
				deptWasFound = true;
			}
		} // end for
		if (deptWasFound) {
			JOptionPane.showMessageDialog(null, dept + " was found in the list");
		} else {
			JOptionPane.showMessageDialog(null, dept + " was not foud in the list");
		}
	}

}
