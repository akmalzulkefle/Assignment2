import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int choice;
		
		TravelAndTransport tat = new TravelAndTransport();			//tat is a new object for Travel And Transport
		tat.setCompanyName("MIRAE Travel&Transport");
		tat.setAddress("No.06, Jalan Raja Udang, Pantai Cenang, Langkawi, Kedah.");
		tat.setPosscode("07000");
		tat.setLocation("Pantai Cenang, Langkawi");
		tat.setWebsite("WWW.MIRAETRAVEL.COM");
		tat.setContactNumber("04-924 2944");
		tat.setFax("04-924 9244");
		
		System.out.println("\t---------------Company Information---------------");
		System.out.println("Company Name : " + tat.getCompanyName());
		System.out.println("Company Address : "+ tat.getAddress());
		System.out.println("Company PostCode : " + tat.getPostcode());
		System.out.println("Company Location : " + tat.getLocation());
		System.out.println("Company Website : " + tat.getWebsite());
		System.out.println("Company Contact Number : " + tat.getContactNumber());
		System.out.println("Company Fax Number : " + tat.getFax());
		System.out.println();
		
		System.out.println("1. Admin\n"
						 + "2. Customer\n");
		System.out.print("Please Enter Your Choice :");
		choice = s.nextInt();
		if(choice == 1) {
		
			Employee e1 = new Employee("Akmal Zulkefle", 101);			//e1 is a new object for Employee
			Employee e2 = new Employee("Driver");						//e2 is a new object for Employee
			System.out.println("Staff Name : " + e1.getName());
			System.out.println("Staff ID : " + e1.getStaffID());
			System.out.println("Staff Position : " + e2.getPosition());
			e1.Salary();
			System.out.println();
		
			Purchase p = new Purchase();								//p is a new object for Purchase
			System.out.println();
			System.out.println("Item Name : " + p.itemName());
			System.out.println("Item Brand : " + p.itemBrand());
			System.out.println("Quantity : " + p.Quantity());
			System.out.printf("Price : RM%.2f\n",p.Price());
			System.out.printf("Total Price : RM%.2f\n",p.TotalPrice());
			System.out.println();
		

			Finance f = new Finance();									//f is a new object for Finance
			f.ProfitLoss();
			System.out.println();
		}
		else if(choice == 2) {
			
			CustomerRegistration cr = new CustomerRegistration();		//cr is a new object for Customer Registration
			System.out.println();
			System.out.println("Your Personal Information");
			System.out.println("Name : " + cr.CustName());
			System.out.println("Identity Number : " + cr.IdentityNumber());
			System.out.println("Contact Number : " + cr.ContactNumber());
			System.out.println("Number Of Passengers : " + cr.NumberOfPassengers());
			System.out.println();
			cr.printTypeOfPackage();									
			
		}
	}

}
