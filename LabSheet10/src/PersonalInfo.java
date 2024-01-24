
public class PersonalInfo {
   private Person name;//object name reference class Person
   private Date bDay; //object bDay reference class Date
   //declare 1 private attribute
   private int personID;
   
   //Default constructor
   //Postcondition: fristName="",lastName""
   //dMonth =1,dDay=1 and dYear=1900
   //persomID=0
   PersonalInfo(){
	   name = new Person();//fristName="",lastName""
	   bDay = new Date();//dMonth =1,dDay=1 and dYear=1900
	   personID = 0;
   }
   //Constructor with parameter
   PersonalInfo(String first,String last, int month,int day,int year,int ID){
	   name = new Person(first,last);//firstName=first, lastName=last
	   bDay = new Date(month,day,year);
	   personID = ID;
   }
   //Method to set the personal information
   //call set method from class Person and class Date
   public void setPersonalInfo(String first,String last,int month,int day,int year,int ID){
   name.setName(first,last);
   bDay.setDate(month,day,year);
   personID = ID;
}
   public String toString() {
	   return "Name: "+ name.toString()+"\n"+"Date of birth: "+bDay.toString()+
	   "\n"+"Personal ID: "+personID;
   }
}
