import java.util.Scanner;

public class Lab503 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Message : ");
		String Message = scan.nextLine();
		Message = Message.toLowerCase();
		int indexnichi = Message.indexOf("nichi");
		
		if(indexnichi>=0) {
			System.out.print("Nichi is sentence");
		}else {
			System.out.print(Message);
			
		}
	}
}
