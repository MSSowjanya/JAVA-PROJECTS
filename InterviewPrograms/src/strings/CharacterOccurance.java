package strings;

import java.util.Scanner;

public class CharacterOccurance {
	static int count=0;
	public static int count(String str, char ch) {
		int length=str.length();
		for(int i=0;i<=length-1;i++) {
			char ch1=str.charAt(i);
			if(ch1==ch)
				count++;		
		}
		return count;		
	}
}
