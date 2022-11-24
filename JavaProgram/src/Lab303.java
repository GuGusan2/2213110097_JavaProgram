import javax.swing.*;
import java.text.*;
import java.util.Random;
public class Lab303 {
    static final int All_MONEY = 800000;
    static final int UP_MONEY = 20000;
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###");
		int withdraw = 0;
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		withdraw = Integer.parseInt(JOptionPane.showInputDialog("Your balance : "+ frm.format(All_MONEY)+"\nInput money to withdraw:"));
		if(withdraw> UP_MONEY){
			JOptionPane.showMessageDialog(null,"Error: Cannot withdraw more than "+frm.format(UP_MONEY),"ERROR",JOptionPane.ERROR_MESSAGE);				
		}
		else if(withdraw >= balance) {
			JOptionPane.showMessageDialog(null,"Error: Cannot withdraw more than balance","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if(withdraw%100 != 0)
		{
			JOptionPane.showMessageDialog(null,"Error: Cannot withdraw "+withdraw+"baht.","ERROR",JOptionPane.ERROR_MESSAGE);
			
		}
		else if(withdraw <=20000) {
		 
		int thousand = withdraw/1000;
		int fivehun = withdraw%1000;
		int hun = fivehun%500;
		
		JOptionPane.showMessageDialog(null,"You withdraw "+frm.format(withdraw)+
				" baht."+"\n1000"+" = "+thousand+ "\n500" +" = "+(fivehun/500)+"\n100"+" = "+(hun/100));
		}
	}
}