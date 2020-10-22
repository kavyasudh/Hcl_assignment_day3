package day3_hcl_assgn;

public class CommisionEmployee extends Employee{
	
private double weeklySalary;
	
	

	public CommisionEmployee(String firstName, String lastName, String socialSecurityNumber, double percentage,double sale) {
		super(firstName, lastName, socialSecurityNumber);
		
	         
	            weeklySalary=(sale*percentage)/100;
	  	     }
	
	 public double getWeeklySalary()
	       {
	          return weeklySalary;
	       }


	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return getWeeklySalary();
	}
	

}
