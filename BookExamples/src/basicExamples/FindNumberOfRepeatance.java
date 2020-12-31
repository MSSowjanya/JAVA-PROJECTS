package basicExamples;

public class FindNumberOfRepeatance {

	public static void main(String[] args) {
		String str="the bird is beautiful and the girl is watching the bird and boy is watching the birds";
		
		String srch="the";
		int i=0;
		int index=0;
		int count=0;
		
		while((index=str.indexOf(srch,i))!=-1) {
			count++;
			i=index+srch.length();
		}
		System.out.println(count);

	}

}
