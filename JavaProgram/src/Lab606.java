import javax.swing.*;

import javax.swing.JOptionPane;

public class Lab606 {

	public static void main(String[] args) {
		int[] number = { 25, 78, 41, 22, 36, 85, 37 };
		int indexofArray = Integer.parseInt(JOptionPane.showInputDialog("Input index of array: "));
		checkIndex(number, indexofArray);
		currentData(number, indexofArray);
		prevData(number, indexofArray);
		nextData(number, indexofArray);
		JOptionPane.showMessageDialog(null,
				"Current data,number[" + (indexofArray) + "] is " + number[indexofArray] + "\n"
						+ (indexofArray != 0 ? "Previous data,number["
								+ (indexofArray - 1) + "] is " + prevData(number, indexofArray) : "No previous data")
						+ "\n"
						+ (indexofArray != number.length
								? "Next data,number[" + (indexofArray + 1) + "] is " + nextData(number, indexofArray)
								: "No next data"));
	}// end of main()

	public static boolean checkIndex(int[] nums, int index) {
		return (index >= nums.length) ? true : false;
	}// end of checkIndex()

	public static int currentData(int[] nums, int index) {
		return nums[index];
	}// end of checkIndex()

	public static int prevData(int[] nums, int index) {
		return nums[index - 1];
	}// end of prevData()

	public static int nextData(int[] nums, int index) {
		return nums[index + 1];
	}// end of nextData()

}
