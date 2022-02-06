import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.javaprojectsample.dao.UserSampleDaoImpl;
import com.javaprojectsample.model.User;

public class SampleMain {

	public static void main(String[] args) {
		
		//create object for the interface
		Calculator cal=new CalculatorImpl();
		
		//ArithmeticException / by zero
		cal.divide(5, 0);
		
		

	}

}
