
public class TestCircle {

	public static void main(String[] args) {
		// Test all constructors and toString()
		Circle c1 = new Circle(1.1,"blue"); //call 3nd Constructor
		System.out.println(c1);
	    System.out.println();
	    
	    Circle c2 = new Circle(2.2); //2nd Constructor
	    System.out.println(c2);
	    System.out.println();
	    
	    Circle c3 = new Circle(); //1st (default Constructor)
	    System.out.println(c3);
	    System.out.println();
	    
	    //Test Setters and Getters
	    c1.setRadius(3.3);
	    c1.setcolor("green");
	    System.out.println(c1);
	    System.out.println("The radius of c1 is: "+c1.getradius());
	    System.out.println("The color of c1 is: "+c1.getColor());
	    
	    //Test getArea() and getCicumference()
	    System.out.printf("The area is: %.2f%n",c1.getArea() );
	    System.out.printf("The circumference is: %.3f",c1.getCircumference() );
	}

}
