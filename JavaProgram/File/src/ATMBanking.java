import java.io.*;
import java.util.Scanner;
public class ATMBanking {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String password;
		System.out.print("Enter account number   : ");
		String accountNumber = console.next();
		while(true){
			String[] account = accountNumber.split("-");
			if(account[0].length()!=1 || account[1].length()!=3 || 
				account[2].length()!=3 || account[3].length()!=2 ||
				account[4].length()!=1) {
				System.out.print("Input wrong type, Enter account number   : ");
				accountNumber = console.next();				
			}
			System.out.print("Enter password : ");
			password = console.next();
			if(password.length()==4) {
				break;
			}
			
			
		}
        			
		
	}

}
