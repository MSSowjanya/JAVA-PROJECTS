package polymorphysm;

class FacebookLoginMethods {
	public void login(String username, String pwd) {
		System.out.println("Login using username and password");
	}
	public void login(long ph_num, String pwd) {
		System.out.println("Login using phone_number and password");
	}

}
class FaceRecognition extends FacebookLoginMethods{
	public void login(String face) {
		System.out.println("Login using face recognition");
	}
}
public class FacebookLogin{
	public static void main(String[] args) {
		FaceRecognition fb=new FaceRecognition();
		fb.login("Divyashree","*****");
		fb.login(9035735320l,"*******");
		fb.login("my face");
	}
}
