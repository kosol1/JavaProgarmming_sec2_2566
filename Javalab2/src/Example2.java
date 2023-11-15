import java.text.*; //1. import library for format number
public class Example2 {

	public static void main(String[] args) {
		//2. define object call DecimalFormat Class
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		final int BUFFET =299;
		int numberofCustomer = 5;
		
		float totaPrice = BUFFET * numberofCustomer;
		//3. apply frm object to totalPrice
		System.out.println("Buffet of "+numberofCustomer+""
				+ " customers is "+ frm.format(totaPrice));
		float serviceCharge = totaPrice+ (totaPrice*3/100);
		System.out.println("Add Service Charge 3% is"
				+frm.format(serviceCharge));

	}

}
