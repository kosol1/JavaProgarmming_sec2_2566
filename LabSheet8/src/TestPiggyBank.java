import java.util.*;
public class TestPiggyBank {
	static PiggyBank pb = new PiggyBank();
	static Scanner scan.nextInt(); = new Scanner (System.in);
public static void main(String[] args) {
/*PiggyBank pb = new PiggyBank();
pb.setPiggyBank(500);
System.out.println("Money Total : " + pb.getTotal());
pb.addTwo (34);
System.out.println("Add 2 Baht Money : " + 34);
System.out.println("Money Total : " + pb.getTotal());
pb.addTen (13);
System.out.println("Add 10 Baht Money : " + 13);
System.out.println("Money Total : " + pb.getTotal());
pb.addFive(100);*/
 }
public static void inputCoin() {
	System.out.println("Money Total : "+pb.getTotal());
	System.out.print("Please defin size of PiggyBank: ");
	int sizeofPiggyBank = scan.nextInt();
	pb.setPiggyBank(sizeofPiggyBank);
	System.out.println("Money Total : "+ pb.getPiggyBank());
	MainMenu();
	
}
public static void MainMenu() {
	while(true) {
	System.out.println("=========================");
	System.out.println("Menu of piggyBank");
	System.out.println("=========================");
	System.out.println("[1] one baht");
	System.out.println("[2] two baht");
	System.out.println("[3] five baht");
	System.out.println("[4] ten baht");
	System.out.println("[5] Exit");
	System.out.println("=========================");
	System.out.print("Please Select Menu[1-5] : ");
	int choice = scan.nextInt();
	if(choice ==1) {
		System.out.print("Insert 1 Baht Money : ");
		int InsertOne = scan.nextInt();
		pb.addOne(InsertOne);
		System.out.println("Money Total : "+ pb.getTotal());
		System.out.println();
	}
	else if (choice ==2) {
		System.out.println("Insert 2 Baht Money : ");
		int InsertOne = scan.nextInt();
		pb.addOne(InsertOne);
		System.out.println("Money Total : "+ pb.getTotal());
		System.out.println();

	}
	else if (choice ==3) {
		System.out.println("Insert 5 Baht Money : ");
		int InsertOne = scan.nextInt();
		pb.addOne(InsertOne);
		System.out.println("Money Total : "+ pb.getTotal());
		System.out.println();
}
	else if (choice ==3) {
		System.out.println("Insert 10 Baht Money : ");
		int InsertOne = scan.nextInt();
		pb.addOne(InsertOne);
		System.out.println("Money Total : "+ pb.getTotal());
		System.out.println();
}
	else if (choice ==5) {
		System.out.print("Bye Bye");
		break;
	}
	}
}
}
}

