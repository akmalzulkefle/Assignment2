import java.util.Scanner;

public abstract class EventDescription{					//to answer question 2.4 Abstraction for declaring superclass Event Description as a abstract class
	
	Scanner s = new Scanner(System.in);				
	
	private int typeOfPackage;
	
	EventDescription (){								

	}
	
	public void TypeOfPackage() {				
		 
		 System.out.println("------------- Package Code -------------");
		 System.out.println("\tPackage 1 : Single Pack");
		 System.out.println("\tPackage 2 : Couple Pack");
		 System.out.println("\tPackage 3 : Family Pack");
		
		 System.out.println("----------------------------------------");
		 
		 System.out.print("Please Choose Your Package : ");
	 	 this.typeOfPackage = s.nextInt();
	 	 System.out.println();
		
		switch (typeOfPackage) {
		
		case 1:
			System.out.println("You Are Choosing 'Package 1'");
			System.out.println("You Will Get : ");
			System.out.println(" 1. One ferry ticket(ROUND TRIP) to Pulau Langkawi.");
			System.out.println(" 2. One vehicle for 3 days 2 nights and you can choose either car or motorcycle with full fuel in tank.");
			System.out.println(" 3. One boat ticket(ROUND TRIP) to Tasik Dayang Bunting.");
			System.out.println(" 4. One ticket to ride Langkawi Skybridge Cable Car.");
			System.out.println("Your Total Payment : \n"
								+ "     Malaysian    : RM 391\n"
								+ "     International: RM 441\n");
			printInfo();
			break;
		case 2: 
			System.out.println("You Are Choosing 'Package 2'");
			System.out.println("(Recommended for Couple!)");
			System.out.println("You Will Get : ");
			System.out.println(" 1. Two ferry ticket(ROUND TRIP) to Pulau Langkawi.");
			System.out.println(" 2. One vehicle for 3 days 2 nights and you can choose either car or motorcycle with full fuel in tank.");
			System.out.println(" 3. Two boat ticket(ROUND TRIP) to Tasik Dayang Bunting and Pulau Payar.");
			System.out.println(" 4. Two ticket to ride Langkawi Skybridge Cable Car.");
			System.out.println("Your Total Payment : \n"
								+ "     Malaysian 	 : RM 562\n"
								+ "     International: RM 662\n");
			printInfo();
			break;
		case 3: 
			System.out.println("You Are Choosing 'Package 3'");
			System.out.println("(Recommended for Family/Group!)");
			System.out.println("You Will Get : ");
			System.out.println(" 1. Six ferry ticket(ROUND TRIP) to Pulau Langkawi.");
			System.out.println(" 2. One vehicle for 3 days 2 nights and you can choose either car(standard/mpv) or van with full fuel in tank.");
			System.out.println(" 3. Six boat ticket(ROUND TRIP) to Tasik Dayang Bunting and Pulau Payar.");
			System.out.println(" 4. Six ticket to ride Langkawi Skybridge Cable Car.");
			System.out.println(" 5. Six ticket to experience Mangrove Forest Kayaking Tour.");
			System.out.println("Your Total Payment : \n"
								+ "     Malaysian 	 : RM 1,372\n"
								+ "     International: RM 1,672\n");
			printInfo();
			break;
		}
		
}
	
	public void printInfo() {						//to answer question 2.2 Polymorphism for using method printInfo 
		System.out.println("Thank you for using our service! Have a nice trip!!!");
	}
	
}