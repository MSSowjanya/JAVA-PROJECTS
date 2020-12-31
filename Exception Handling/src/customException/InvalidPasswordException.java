package customException;

public class InvalidPasswordException extends RuntimeException{
	void info() {
		System.out.println("Invalid Password: Enter correct password");
	}
}
