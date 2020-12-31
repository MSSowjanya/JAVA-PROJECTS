package customException;

public class Custom1 {

	public static void main(String[] args) {
		ATM atm=new ATM();
		try {
			atm.login("shree");
		}
		catch (InvalidPasswordException e){
			e.info();
		}
	}
}

