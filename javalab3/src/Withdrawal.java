import javax.swing.*;
import java.util.*; //use library for Random class

public class Withdrawal {

	public static void main(String[] args) {
		//using class Random for random money
		Random rdmoney = new Random();
		int balance = rdmoney.nextInt(9) * 100000;
		JOptionPane.showInputDialog(null, "You balance: " +balance +"\n input money to withdraw:"+ JOptionPane.ERROR_MESSAGE);
		int withdraw =Integer.parseInt(JOptionPane.showInputDialog("You withdraw  "+balance + "\nInput money to withdraw:"));
		if(withdraw>2000) {
			JOptionPane.showMessageDialog(null, "Error:cannot withdraw more than "+ JOptionPane.ERROR_MESSAGE);
		}
		else if(withdraw>balance ) {
			JOptionPane.showMessageDialog(null, "Error:cannot withdraw more than balance "+ JOptionPane.ERROR_MESSAGE);
		}
		else if(withdraw % 100 !=0) {
			JOptionPane.showMessageDialog(null, "Error:cannot withdraw  "+ JOptionPane.ERROR_MESSAGE);
			
		}
		int b1000=(withdraw/1000);
		int b500=(withdraw%1000/500);
		int b100=(withdraw%1000/100);
		
		OJptionPane.showMessageDialog(null, "You withdraw"+withdraw+"\n1000 = "+b1000+"\n500 ="+b500+"\n100 ="+b100);