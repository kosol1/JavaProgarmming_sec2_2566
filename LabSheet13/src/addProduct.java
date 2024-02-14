import java.util.*;
import java.io.*;
public class addProduct {

	public static void main(String[] args)throws IOException {
		// create object for write(save) data to file using PrintWriter Class
		PrintWriter writeFile = new PrintWriter(new File("d://txtFile//product.txt")); 
		// create object for input data from keyboard(console)
	    Scanner scan = new Scanner(System.in);
	    //Display and input data from keyboard
	    System.out.print("Input product id:");
	    String productId = scan.next();
	    System.out.print("Input product Name:");
	    String productName = scan.next();
	    System.out.print("Input product Unit:");
	    int productUnit = scan.nextInt();
	    System.out.print("Input product Price:");
	    float productPrice = scan.nextFloat();
	    //save data to file
	    writeFile.println(productId+","+productName+","+productUnit+","+productPrice);
	    System.out.println("Save file already...");
	    writeFile.close();
	    
	}

}
