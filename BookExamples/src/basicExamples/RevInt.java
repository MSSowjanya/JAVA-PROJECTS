package basicExamples;

public class RevInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1244;
		//i=Integer.parseInt(StringBuffer(Integer.toString(i)).reverse().toString());
				//StringBuffer(Integer.toString(i)).reverse().toString();
		i=Integer.parseInt(new StringBuffer(Integer.toString(i)).reverse().toString());
		System.out.println(i);
		
	}

}
