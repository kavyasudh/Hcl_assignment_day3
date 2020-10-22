package day3_hcl_assgn;

public class HourlyEmployees extends Employee
{
	private double hourlySalary;
	
	

	public HourlyEmployees(String firstName, String lastName, String socialSecurityNumber, double hourlySalary) {
		super(firstName, lastName, socialSecurityNumber);
		
	         
		this.hourlySalary=hourlySalary*300;
	  	     }
	
	 public double getHourlySalary()
	       {
	          return hourlySalary;
	       }
	 
	 
	 
	 
	 


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HourlyEmployees [hourlySalary=");
		builder.append(hourlySalary);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return getHourlySalary();
	}
	
}

