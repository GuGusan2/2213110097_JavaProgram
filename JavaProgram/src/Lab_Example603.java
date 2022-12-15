import java.util.*;

public class Lab_Example603 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[5];
		for(int i = 0; i<nums.length; i++) {
			System.out.print("Input number "+ (i+1)+" : ");
			nums[i] = scan.nextInt();			
		}
		System.out.println();
		//int totalNums = sumOfPos(nums);
		//System.out.println("Summation of positive number is "+ totalNums);
		System.out.println("Summation of positive number is "+ sumOfPos(nums));
	}//end of main

	public static int sumOfPos(int[] number) {
		int sum = 0;
		for(int _num : number) {
			sum += _num;
		}
		return sum;
	}//end of sumPos
}
