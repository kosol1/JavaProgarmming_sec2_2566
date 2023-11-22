import java.text.DecimalFormat;

import javax.swing.*;//import library for input data from Dialog box

import javax.swing.JOptionPane;
public class Example1 {

	public static void main(String[] args) {
		final int BUFFET = 299;
		//input and convert data from dialog box
		int numberofCustomer = Integer.parseInt(
				JOptionPane.showInputDialog("How many customrt per bill?"));
		
		double discount , totalPrice = 0;
				//calculate total price of buffet
				totalPrice = BUFFET * numberofCustomer;
				//suing showMesage dialog box for display totalPrice
				JOptionPane.showMessageDialog(null,"Amount to be paid is"+ totalPrice + "bath.");
				//using Confirm dialog box
				DecimalFormat frm = new DecimalFormat("#,###.00");
				int memberCard;
				do {
					memberCard = JOptionPane.showConfirmDialog(null,
							"Total price is "+ totalPrice+" bath."+
					        "\nDo you have a member card");
				}while(memberCard==JOptionPane.CANCEL_OPTION);
				if(memberCard==JOptionPane.YES_OPTION) {
					//discount = totalPrice -(totalPrice*10/100)
					discount = totalPrice * 90/100 ; //discount 10%
					JOptionPane.showMessageDialog(null,"Amount to be paid is"+ discount + "bath.");
				}//end of if
				else if(memberCard==JOptionPane.NO_OPTION) {
					JOptionPane.showMessageDialog(null,"Amount to be paid is"+ totalPrice + "bath.");
				}
					
					
				
				
				

	}

}
