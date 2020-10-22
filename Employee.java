package day3_hcl_assgn;

public abstract class Employee implements Payable
   {
      private String firstName;
      private String lastName;
      private String socialSecurityNumber;
	
      public Employee(String firstName, String lastName, String socialSecurityNumber) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", socialSecurityNumber=");
		builder.append(socialSecurityNumber);
		builder.append("]");
		return builder.toString();
	}
      

   
   
   }