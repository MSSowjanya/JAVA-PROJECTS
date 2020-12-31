package basicPrograms;

public class PalindromeRecursion {
	static int rem=0;
	static int rev=0;
	public static boolean reverse(int num) {
		int copy=num;
		if(num==0)
			return false;
		else {
			rem=num%10;
			rev=rev*10+rem;
			reverse(num/10);
			}
	if(rev==copy)
		return true;
	else
		return false;
	}

}
