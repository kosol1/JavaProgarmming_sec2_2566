import java.text.DecimalFormat;
import java.util.Scanner;

public class SalespersonSalary {

	public static void main(String[] args) {
		//Declare constants
		DecimalFormat frm = new DecimalFormat("####.00");
		Scanner scan = new Scanner(System.in);
		final double COMMISSION_RATE = 0.15;
		final int SENTINEL = -1; //Terminating value for input
		//Declare variables		
	    int sales;  // Input gross sales
		double salary; // Salary to be computed

		while(true) {
			System.out.print("Enter sales in dollars (or -1 to end) : ");
			salary = scan.nextInt();
			if(salary<SENTINEL) {
				System.out.print("bye");
				break;
			}
			salary =(salary * COMMISSION_RATE)+1000;
		System.out.println("Salary is:" + frm.format(salary));
	}
  }
}
