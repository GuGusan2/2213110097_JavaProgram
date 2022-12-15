import javax.swing.*;

public class Lab605 {


	public static void main(String[] args) {
		int[] number = new int[5];
		for (int i = 0; i < number.length; i++) {
			number[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number " + (i+1) + " : "));
		} // end for
		showEven(number);
		showOdd(number);
	}// end of main()

	public static void showEven(int[] nums) {
		String space = "";
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				space += nums[i] + " ";
			}
		}//end for
		
		JOptionPane.showMessageDialog(null, "List of even number: \n" + space);
	}// end of showEven()

	public static void showOdd(int[] nums) {
		String space = "";
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 != 0) {
				space += nums[i] + " ";
			}
		} // end for

		JOptionPane.showMessageDialog(null, "List of odd number: \n" + space);
	}// end of showOdd()

}
