//Q1. Create a class called Invoice that a hardware store might use to represent an invoice for an item
//sold at the store. An Invoice should include four pieces of information as fields—a part number
//(type String), a part description (type String), a quantity of the item being purchased (type int) and a
//price per item (double). Your class should have a constructor
//that initializes the four instance variables. Provide a set and a get method for each instance variable.
//calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the
//amount as a double value.
//If the quantity is not positive, it should be set to 0.
//If the price per item is not positive, it should be set to 0.0.
//Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.

package Q1;

import java.util.Scanner;

public class Invoice {

	private String partNumber;
	private String description;
	private int quantity;
	private double price;
	private double amount = 1;
	
	public Invoice() {
		this("","",0,0.0);
	}

	public Invoice(String partNumber, String description, int quantity, double price) {
		super();
		this.partNumber = partNumber;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public String getDescription() {
		return description;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Part Number:");
		partNumber = sc.nextLine();
		
		System.out.println("Enter Description:");
		description = sc.nextLine();
		
		System.out.println("Enter Quantity:");
		quantity = sc.nextInt();
		if(quantity<0)
		{
			this.quantity = 0; 
		}
		
		System.out.println("Enter Price:");
		price = sc.nextDouble();
		
		if(price<0.0)
		{
			this.price = 0;
		}
		
	}
	
	private double calculate()
	{
		amount = quantity*price;
		
		return amount;
	}
	
	public void display()
	{
		System.out.println("Part Number is:" + partNumber);
		System.out.println("Description is:" + description);
		System.out.println("Quantity is:"+ quantity);
		System.out.println("Price is:"+price);
		System.out.println("Total Amount is:"+ calculate());
	}
	
}
