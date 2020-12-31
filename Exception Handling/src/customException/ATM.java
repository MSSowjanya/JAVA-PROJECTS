package customException;

public class ATM {
	void login(String pwd) throws InvalidPasswordException{
		if(pwd.equalsIgnoreCase("ShreeRaj")) {
			System.out.println("Correct Password");
		}
		else{
			throw new InvalidPasswordException();
		}
	}

}
