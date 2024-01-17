
public class Testdate {

	public static void main(String[] args) {
		// Tset constructor and toSting()
		Date d1 = new Date (2023,2,8);
		System.out.println(d1);
		
		//Test Setter and Getters
		d1.setYeat(2023);
		d1.semonth(12);
		d1.setYday(21);
		System.out.println("Year is" +d1.gitYear());
		System.out.println("month is" +d1.gitmonth());
		System.out.println("day is" +d1.gitday());
		
		d1.setDate(2024,1,2);
		System.out.println("The date of object d1: "+d1);
		

	}

}
