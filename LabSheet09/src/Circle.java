
public class Circle {
    //The public constants
	public static final double DEFAULT_RADIUS = 1.0;
	public static final String DEFAULT_COLOR = "red";
	
	//The private 2 attributes
	private double radius;
	private String color;
	
	//Constructs a Circle with default radius and color
	//1st(default) Constructor
	Circle(){
		this.radius = DEFAULT_RADIUS;
		this.color = DEFAULT_COLOR;
	}
	//Constructs a Circle with the given radius and default color
	//2nd Constructs
	Circle(double radius){
		this.radius = radius;
		this.color = DEFAULT_COLOR;
	}
	//Constructs a Circle with the given radius and default color
	//3nd Constructs
	Circle(double radius,String color){
		this.radius = radius;
		this.color = color;
	}
	//returns the radius-the public getter for private attribute radius
	public double getradius() {
		return this.radius;
	}
	//set the radius-the public setter for private variable radius
	public void setRadius(double radius) {
		this.radius = radius;
	}
		//Set the color-the public setter for private attribute color
	public String getColor() {
		return this.color;
	}
	public void setcolor(double color) {
		this.radius = color;
	}
	//return a self-descriptive string for a Circle
	public String toString() {
		return "Circle[radus= "+this.radius+", color= "+color+"]";
	}
	//Return the area of this Circle
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
		//return Math.PI * radius * radius;
	}
	//Return the circumference of this Circle
	public double getCircumference() {
		return 2.0 * Math.PI * radius;
	}
}
