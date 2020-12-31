package stringPrograms;

public class UpperCaseToLower {

	public static void main(String[] args) {
		String str= "DivyaShree";
		char ch;
		StringBuffer buff=new StringBuffer(str);
		for(int i=0; i<buff.length()-1; i++) {
			ch=buff.charAt(i);
			if(Character.isLetter(ch)) {
				ch=buff.charAt(i);
				if(Character.isUpperCase(ch))
					buff.append(Character.toLowerCase(ch));
				else
					buff.append(Character.toUpperCase(ch));
			}
			else 
				buff.append(ch);
		}
		System.out.println(str);
		System.out.println(buff);
		System.arraycopy(src, srcPos, dest, destPos, length);

	}

}
