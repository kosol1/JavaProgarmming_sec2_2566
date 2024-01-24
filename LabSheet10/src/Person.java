
public class Person {
   //declare 2 private attributes
	private String firstName;
	private String lastName;
	
	//Default constructor
	//Initialize fristName and lastName to an empty string
	Person(){
		firstName= "";
		lastName=  "";
	}
	//Constructor with parameters
	Person(String first, String last){
		firstName =first;
		lastName=  last;	
	}
	public void setDate(String first, String last) {
		firstName =first;
		lastName=  last;
	}
	
	//Method to return firstName
	public String firstName() {
		return firstName;
	}
	//Method to return lastName
	public String getlastName() {
		return lastName;
	}
	//Method to output the first name and last name
	public String toString() {
		return firstName+" "+lastName;
	}
}
