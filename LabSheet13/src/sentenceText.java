import java.util.*;
import java.io.*;
public class sentenceText {

	public static void main(String[] args)throws IOException {
		// create object for write(save) data to file using PrintStrem Class
		PrintStream writeFile = new PrintStream(new File("d://txtFile//sentence.txt")); 
		// create object for input data from keyboard(console)
		Scanner scan = new Scanner(System.in);
		int i=1;
		while(true) {
			System.out.print("Sentence: ");
			String word = scan.next().toUpperCase();
			
			if(word.equalsIgnoreCase("stop")) {
				break;
			}
			//save data to file
			writeFile.print(i+":"+word);
			i++;
		}
		System.out.println("File is save!!");
		
		writeFile.close();
		

	}

}
