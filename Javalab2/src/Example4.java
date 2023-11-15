import java.text.DecimalFormat;

import javax.swing.*; //1.import library for data from dialog box
public class Example4 {
	public static void main(String[] args) {
	    //2. Display and input data from dialog box
		DecimalFormat frm = new DecimalFormat("#,###.00");
		String productName = JOptionPane.showInputDialog("Input product name : ");
		
		/*string strUnit = JOptionPane.showInputDialog("Input product unit");
		//convert string to int
		int unitPrice = Integer.parseInt(strUnit);*/

		int unitPrice = Integer.parseInt(
				JOptionPane.showInputDialog("Input product unit"));
		
		double pricePerUnit = Float.parseFloat(
				JOptionPane.showInputDialog("Input product unit"));
		
		double totalPrice = unitPrice * pricePerUnit;
		double vat = totalPrice  +(totalPrice*7/100);
		
		//show message from dialog box
		JOptionPane.showMessageDialog(null, "Totat Price is "
				+ frm.format(totalPrice) + " baht."
						+ "\nAdd VAT 7% is "+ frm.format(vat) +" baht.");
	}

}
