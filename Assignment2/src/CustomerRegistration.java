
import java.util.Scanner;

public class CustomerRegistration extends EventDescription{				//to answer question 2.1 Inheritance of Event Description

	Scanner s = new Scanner(System.in);									
	
	private String CustName, IdentityNumber, ContactNumber;
	private int NumberOfPassengers;
	
	CustomerRegistration(){												
		
		System.out.println("Please fill your personal information below.");
		System.out.print("Please Enter Your Name : ");
		this.CustName = s.nextLine();
		System.out.print("Please Enter Your Identity Number :");
		this.IdentityNumber = s.nextLine();
		System.out.print("Please Enter Your Contact Number :");
		this.ContactNumber = s.nextLine();
		System.out.print("How Many Passengers :");
		this.NumberOfPassengers = s.nextInt();
		
	}
	 
	public void printTypeOfPackage() {											//to answer question 2.2 Polymorphism for using method printInfo 
		super.TypeOfPackage();

	}
	
	public String CustName() {
		return this.CustName;
	}
	
	public String IdentityNumber() {
		return this.IdentityNumber;
	}
	
	public String ContactNumber() {
		return this.ContactNumber;
	}
	
	public Integer NumberOfPassengers() {
		return this.NumberOfPassengers;
	}

	
}
