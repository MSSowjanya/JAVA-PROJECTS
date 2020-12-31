package basicPrograms;

public class Palindrome {
	public static boolean isPalindrome(int num) {
		int rev=0;
		int copy=num;
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(rev==copy)
			return true;
		else
			return false;		
	}
}

