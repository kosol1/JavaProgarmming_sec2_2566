
public class Customer {
	private int id;
	private String name;
	private int discount;
	
    Customer(int id,String name, int discount){
       this.id = id;
    	this.name = name;
    	this.discount = discount;
}
    public int getid() {
		return id;
	}
    public String getname() {
		return name;
	}
    public int getdiscount() {
		return discount;
	}
    public void setdiscount(int discount) {
    	this.discount = discount;
    }
    public String toString() {
		return getname() + "("+getid()+")"+"("+getdiscount()+")";
	}
}
