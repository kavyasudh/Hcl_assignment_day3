package day3_hcl_assgn;

public class SalariedEmployee extends Employee
{
	private double weeklySalary;
	
	

	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
		this.weeklySalary = weeklySalary;
	}
	public void setWeeklySalary( double salary )
	     {
	         if ( salary >= 0.0 )
	            weeklySalary = salary;
	         else
	            throw new IllegalArgumentException("Weekly salary must be >= 0.0" );
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

