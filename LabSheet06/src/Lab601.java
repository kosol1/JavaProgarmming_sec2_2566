import javax.swing.*;
public class Lab601 {

	public static void main(String[] args) {
		inputEmail();
	}//end main()
		public static void inputEmail() {
			String inputEmail = JOptionPane.showInputDialog("Input your e-mail:").toLowerCase();
			//inputEmail = inputEmail.toLowerCase();
			boolean chkEmail = checkEmail(inputEmail);
			displayEmail(chkEmail,inputEmail);
		}//end inputEmail()
		public static boolean checkEmail(String email) {
			if(email.endsWith("hotmail")||email.endsWith("gmail.com")) {
			return false;
			}
			else return false; 
	}//end checkEmail()

	public static void displayEmail(boolean chemail,String inEmail) {
		if(chemail==true) {
			JOptionPane.showMessageDialog(null,"Your e-mail is "+inEmail);
		}else {
			JOptionPane.showMessageDialog(null,"Your e-mail is not hotmail or gmail");
}
		}
	}

			
		


