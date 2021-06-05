import java.util.Scanner;

public class Finance {								

	final double Insurance = 5000;
	
	Scanner s = new Scanner(System.in);				
	
	private double operationCost, Sales, Profit;

	Finance(){										
		
	}
	
	public double ProfitLoss() {					
		
		double Sales, TotalOperationCost, fuelCost, wagesExpense, totalEmployee, totalWagesExpense, vehicleServiceExpense;
		
		System.out.println("All the amount must be input for a month.");
		System.out.print("Please Enter Your Sales : RM");
		Sales = s.nextDouble();
		System.out.print("Please Enter Your Fuel Cost : RM");
		fuelCost = s.nextDouble();
		System.out.print("Please Enter Your Wages Expense : RM");
		wagesExpense = s.nextDouble();
		System.out.print("Please Enter Your Total Employee : ");
		totalEmployee = s.nextDouble();
		totalWagesExpense = wagesExpense*totalEmployee;
		System.out.printf("Your Total Wages Expense : RM%.2f\n",totalWagesExpense);
		System.out.print("Please Enter Your Vehicle Service Expense : RM");
		vehicleServiceExpense = s.nextDouble();
		System.out.printf("Your Insurance Payment : RM%.2f\n",Insurance);
		TotalOperationCost = fuelCost + totalWagesExpense + vehicleServiceExpense + Insurance;
		System.out.printf("Your Total Operation Cost : RM%.2f\n",TotalOperationCost);
		Profit = Sales - TotalOperationCost;
		//ProfitLoss();
		
		if(Sales-TotalOperationCost>0){
			System.out.printf("Profit : RM%.2f\n",(Sales-TotalOperationCost));
        } 
		else if(Sales-TotalOperationCost<0){
			System.out.printf("Loss : RM%.2f\n",(Sales-TotalOperationCost));
        } 
		return Profit;
		
	}
	
	public double operationCost() {
		return this.operationCost;
	}
	
	public double Sales() {
		return this.Sales;
	}
	
	public double Insurance() {
		return this.Insurance;
	}
	
	public double Profit() {
		return this.Profit;
	}
	
}