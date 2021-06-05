import java.util.Scanner;

public class Purchase {						

	Scanner s = new Scanner(System.in);			
	
	private String itemName, itemBrand;
	private double Quantity, Price, TotalPrice;
	
	Purchase(){									
		
		System.out.println("What do you want to buy?");
		System.out.print("Please Enter The Item Name : ");
		this.itemName = s.next();
		System.out.print("Please Enter The Item Brand : ");
		this.itemBrand = s.next();
		System.out.print("Please Enter The Quantity : ");
		this.Quantity = s.nextDouble();
		System.out.print("Please Enter The Price : RM");
		this.Price = s.nextDouble();
		this.TotalPrice = this.Price*this.Quantity;
	}
	
	public String itemName() {
		return this.itemName;
	}
	
	public String itemBrand() {
		return this.itemBrand;
	}
	
	public double Quantity() {
		return this.Quantity;
	}
	
	public double Price() {
		return this.Price;
	}
	
	public double TotalPrice() {
		return this.TotalPrice;
	}
	
}