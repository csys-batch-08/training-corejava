import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.javaprojectsample.dao.UserSampleDaoImpl;
import com.javaprojectsample.model.User;

public class SampleMain {
	public static void main(String[] args) {
		
		User user=new User("qwerty", "qwert", "qwert"); 
		UserSampleDaoImpl userDao=new UserSampleDaoImpl();
		System.out.println(userDao.userInsert(user)>0?"Value inserted successfully":"value not inserted");
		//userDao.userInsert(user);
		
	}

}
