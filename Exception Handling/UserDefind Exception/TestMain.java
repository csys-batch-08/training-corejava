import com.javaprojectsample.validator.UserValidator;

public class TestMain {

	public static void main(String[] args) {
		
		UserValidator userValidaor=new UserValidator();
		boolean flag=userValidaor.validateUser("", "");
		
		try {
			if(flag==false)
			{
				throw new UserNotFoundException();
				
			}
			else
			{
				//Login success forward to next operation
			}
		} catch (UserNotFoundException e) {
			
			System.out.println(e.getMessage());
		}
	}
}
