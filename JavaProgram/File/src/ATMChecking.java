import java.io.*;
import java.util.Scanner;

public class ATMChecking extends ATMData{

	private int money;
	
	public ATMChecking(String accountNumber,String password,int money) {
		super(accountNumber, password);
		this.money = money;
	}
	
	public boolean checkBookBank() throws IOException {
		BufferedReader read = new BufferedReader(new FileReader("ATMBookBank.txt"));
		String temp = "";
		boolean check = false;
		while((temp = read.readLine()) !=null) {
			String accountNumber = read.readLine();
			String password = read.readLine();
			money = read.read();
			String[] account = accountNumber.split("-");
//			if(account[0].length()==1 || account[1].length()==3 || 
//					account[2].length()==3 || account[3].length()==2 ||
//					account[4].length()==1) return true;
//			else return false;
			if(account[0]== super.getID() ) {
				
				check = true; 
			}
			 			
		}
		read.close();
		return check;
		
	}
	
	public void show() {
		
	}
}
