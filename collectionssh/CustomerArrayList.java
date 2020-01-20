package collectionssh;

import java.util.ArrayList;

public class CustomerArrayList 
{
	public static void main(String[] args)
	{
		ArrayList<Customer> customers=new ArrayList<Customer>();
		Customer customer1=new Customer("John",20000D);
		customer1.addTransaction(30000D);
		customer1.addTransaction(50000D);
		customers.add(customer1);
		Customer customer2=new Customer("Tim",15000D);
		customer2.addTransaction(20000D);
		customers.add(customer2);
		for(int i=0;i<customers.size();i++)
		{
			Customer customer=customers.get(i);
			for(int k=0;k<customer.getName().size();k++)
				
			{String customer_name=customer.getName().get(k);
			System.out.println(customer_name);
			}
			for(int j=0;j<customer.getTransactions().size();j++)
			{
				Double Transaction=customer.getTransactions().get(j);
				System.out.println(Transaction);
			}
		}
		
	}

}
class Customer
{
	private ArrayList<Double> transactions;
	private ArrayList<String> names;
	public Customer
	(String name,double initialAmount)
	{
		this.names=new ArrayList<String>();
		this.transactions=new ArrayList<Double>();
		addTransaction(initialAmount);
		addName(name);
	}
	public void addTransaction(double amount)//storing transactions in a different arraylist of type double
	{
		this.transactions.add(amount);
		
	}
	//storing the customer names in a seperate array list of type string
	public void addName(String c_name)
	{
		this.names.add(c_name);
	}
	public ArrayList<String> getName()
	{
		return names;
	}
	public ArrayList<Double> getTransactions()
	{
		return transactions;
	}
}