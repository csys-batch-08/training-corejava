
public class SampleMain2 {

	public static void main(String[] args) {
		
		//create object for the interface
		Calculator cal=new CalculatorImpl();
		
		//handle the exception
		try
		{
		cal.divide(5, 0);
		}
		catch(ArithmeticException e )
		{
			System.out.println(e.getMessage());
		}
		
		

	}

}
