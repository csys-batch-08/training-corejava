
public class UserNotFoundException extends Exception{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Not a Registered User";
	}
}
