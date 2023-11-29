import java.text.DecimalFormat;
import java.util.Scanner;

public class pensionContributionCalculator {

	public static void main(String[] args) {
		//Declare constants
		final int SALARY_CEILING = 6000;
	    final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
	    final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
	    final double EMPLOYEE_RATE_55_AND_60 = 0.13;
	    final double EMPLOYER_RATE_55_AND_60 = 0.13;
	    final double EMPLOYEE_ATE_60_AND_65 = 0.075;
	    final double EMPLOYER_RATE_60_AND_65 = 0.009;
	    final double EMPLOYEE_RATE_65_AND_ABOVE = 0.005;
	    final double EMPLOYER_RATE_65_AND_ABOVE = 0.075;
	    
	    //Declare variables
	    Scanner scan = new Scanner(System.in);
	    int salary, age;   //to be input
	    int contributbleSalry;
	    double employeeContribtion, employerContrbution, totalContribution;
		DecimalFormat frm = new DecimalFormat("####.00");

	    
	    System.out.print("Enter the monthly salary : ");
	    salary = scan.nextInt();
	    
	    System.out.print("Enter the age : ");
	    age = scan.nextInt();
	    
	    //Check the contribution cap
	    contributbleSalry = Math.min(salary,SALARY_CEILING);
	    if (age<= 55) { //55 and below
	    	employeeContribtion = EMPLOYEE_RATE_55_AND_BELOW * contributbleSalry;
	    	employerContrbution = EMPLOYER_RATE_55_AND_BELOW * contributbleSalry;
	    }else if (age<=60) { // (60, 65]
	    	employeeContribtion = EMPLOYEE_RATE_55_AND_60 * contributbleSalry;
	    	employerContrbution = EMPLOYER_RATE_55_AND_60 * contributbleSalry;
	    }else if (age<=65) { // (55,60]
	    	employeeContribtion = EMPLOYEE_ATE_60_AND_65 * contributbleSalry;
	    	employerContrbution = EMPLOYER_RATE_60_AND_65 * contributbleSalry;
	    }else { // above65]
	    	employeeContribtion = EMPLOYEE_RATE_65_AND_ABOVE * contributbleSalry;
	    	employerContrbution = EMPLOYER_RATE_65_AND_ABOVE * contributbleSalry;
	    }
	    
	    totalContribution = employerContrbution + employeeContribtion;
	    System.out.print("The employee's contribution is; "+ frm.format(employeeContribtion)
	    +"\nThe employer's contribution is: "+ frm.format(employerContrbution)
	    +"\nThe total contribution is: "+ frm.format(totalContribution));         	    
	}

}
