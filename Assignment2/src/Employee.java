import java.util.Scanner;

public class Employee implements Tax_Amount {			//to answer question 2.5 Interface using Implements 
	
	Scanner s = new Scanner(System.in);				
	
	 private String name, position;
	 private int StaffID;
	 private double TotalNetSalary;
	 
	 Employee(String position){						
		 
		 this.position = position;
	 }
	 
	 Employee(String name, int StaffID){			
		 
		 this.name = name;
		 this.StaffID = StaffID;
	 }
	 
	 Employee(double TotalNetSalary){								
		 
		 Salary();
		 
		 }
	 	 
	public double  Salary() {					
		
		double MonthlySalary, NumberOfDaysWork, NumberOfDayMonth, TotalSalary, TotalNetSalary;
		
		System.out.print("Enter MonthlySalary : RM ");
		MonthlySalary=s.nextDouble();
		System.out.print("Enter NumberOfDaysWork : ");
		NumberOfDaysWork=s.nextDouble();
		System.out.print("Enter NumberOfDayMonth : ");
		NumberOfDayMonth=s.nextDouble();
		TotalSalary=(MonthlySalary*NumberOfDaysWork)/NumberOfDayMonth;
		System.out.printf("Your TotalSalary : RM%.2f\n",TotalSalary);
		TotalNetSalary = TotalSalary - (TotalSalary*getTax_Amount());
		System.out.printf("Your TotalNetSalary : RM%.2f\n",TotalNetSalary);
		return TotalNetSalary;
		
			}
	
	 public double getTax_Amount() {
		 	return 0.05;
	 	}
	
	 public String getName() {
	        return this.name;
	    }
	 
	 public String getPosition() {
		 	return this.position;
	 	}
 
	 public Integer getStaffID() {
	        return this.StaffID;
	    }

	 public double getTotalNetSalary() {
	        return this.TotalNetSalary;
	    }
	
}
