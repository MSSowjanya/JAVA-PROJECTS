package oopsExamples;



abstract class Shopping{
	abstract void shop();
}
class BigBasket extends Shopping{
	void shop() {
		System.out.println("Shop Vegetables");;
	}
}
class Myntra extends Shopping{
	 void shop() {
		 System.out.println("Shop clothes");
	 }
}
public class Abstraction {	
	public static void main(String[] args) {
		Myntra app1=new Myntra();
		app1.shop();
		BigBasket app2=new BigBasket();
		app2.shop();
	}
}
