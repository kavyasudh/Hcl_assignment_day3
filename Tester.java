package day3_hcl_assgn;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Payable[] payableObjects = new Payable[ 6 ];
		
		         // populate array with objects that implement Payable
		         payableObjects[ 0 ] = new Invoice( "01234", "seat", 2, 375.00 );
		         payableObjects[ 1 ] = new Invoice( "56789", "tire", 4, 79.95 );
		         payableObjects[ 2 ] =
		            new SalariedEmployee( "kavya", "sudha", "111-11-1111", 800.00 );
		         payableObjects[ 3 ] =
		           new SalariedEmployee( "cherry", "chinnu", "888-88-8888", 1200.00 );
		         
		         payableObjects[ 4 ] =
				            new HourlyEmployees( "Johns", "Smith", "111-13-1111", 8000.00 );
		         
		        
				         payableObjects[ 5 ] =
				           new CommisionEmployee( "gathvik", "Reyansh", "888-89-8888", 10,12000.00 );
				
		
		         System.out.println(
		           "Invoices and Employees processed polymorphically:\n" );
		
		         // generically process each element in array payableObjects
		         for ( Payable currentPayable : payableObjects )
		        {
		            // output currentPayable and its appropriate payment amount
		            System.out.printf( "%s \n%s: $%,.2f\n\n",
		               currentPayable.toString(),
		              "payment ", currentPayable.getPaymentAmount() );

	}

}
}

