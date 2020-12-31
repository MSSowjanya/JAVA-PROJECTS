package constructors;

public class Facebook {

	public static void main(String[] args) {
		Register reg1=new Register("Divya", "Shree", "17-04-1993", "divyasri.govindraj@gmail.com", 9035735320l);
		reg1.details();
		Register reg2=new Register("Divya", "17-04-1993", "divyasri.govindraj@gmail.com");
		reg2.details1();
	}

}
class Register{
	String fname, lname, dob, mailID;
	long ph_num;
	Register(String fname, String lname, String dob, String mailID, long ph_num){
		this.fname=fname;
		this.lname=lname;
		this.dob=dob;
		this.mailID=mailID;
		this.ph_num=ph_num;
	}
	Register(String fname, String dob, String mailID){
		this.fname=fname;
		this.lname=lname;
		this.dob=dob;
		this.mailID=mailID;
	}
	void details() {
		System.out.println("fname: "+fname+", "+"lname: "+lname+", "+"dob: "+dob+", "+"emailID: "+mailID+", "+"ph_num: "+ph_num);
	}
	void details1() {
		System.out.println("name: "+fname+", "+"dob: "+dob+", "+"emailID: "+mailID);
	}
}