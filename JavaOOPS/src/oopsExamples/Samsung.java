package oopsExamples;

public class Samsung {
		String brand="Samsung S4";
		double width=6.3;
		double price=18000;
		void call(){
			System.out.println("Calling");
	    }
		void message(){
			System.out.println("sending messages");
	    }
		public static void main(String[] args) {
			Samsung s4=new Samsung();
			System.out.println(s4.brand);
			System.out.println(s4.width);
			System.out.println(s4.price);
			s4.call();
			s4.message();
	}
}
