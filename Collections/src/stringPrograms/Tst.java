package stringPrograms;

public class Tst {
	public static void main(String[] args) {
		int index=0;
		String str="jaaammaa";
		for(int i=0; i<str.length();i++){
			for (int j=i+1; j<str.length();) {
				index=str.indexOf(str.charAt(i), j);
				j=index+1;
			}
			System.out.println(index+1);
		}
	}
	

}
