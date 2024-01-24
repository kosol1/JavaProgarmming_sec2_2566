
public class Invoice
{
	private int id;
	private Customer customer;
	private double amount;
	Invoice(int id, Customer customer, double amount)
	{
this.id = id;
		this.customer = customer;
		this.amount = amount;
	}
	public int getID()
	{
		return this.id;
	}
	public Customer getCustomer()
	{
		return this.customer;
	}
	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}
	public double getAmount()
	{
		return this.amount;
	}
	public void setAmount(double amount)
	{
		this.amount = amount;
	}
	public int getCustomerID()
	{
		return customer.getid();
	}
	public String getCustomerName()
	{
		return customer.getname();
	}
	public int getCustomerDiscount()
	{
		return customer.getdiscount();
	}
	public double getAmountAfterDiscount()
	{
		return getAmount()-(getAmount()*getCustomerDiscount()/100);
	}
	public String toString()
	{
		return "Invoice[id="+id+"customer="+this.customer+",amount="+this.getAmountAfterDiscount()+"]";
	}
}
