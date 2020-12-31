package javaScenarios;

import java.util.Scanner;

public class ElectriciyBillGen {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number of units");
		int units=scan.nextInt();
		System.out.println("Enter arriar amount if any");
		double arriar=scan.nextInt();
		double amount=0;
		double amountPayable;
		double discount=0;
		double fine=0;
		if(units<=50) {
			amount=units*1.2;
		}
		else if(units>50 && units<=100) {
			amount=(50*1.2)+(units-50)*2.4;
		}
		else if(units>100 && units<=150) {
			amount=(50*1.2)+(50*2.4)+((units-100)*3.6);
		}
		else if(units>150 && units<=200) {
			amount=(50*1.2)+(50*2.4)+(50*3.6)+((units-150)*4.8);
		}
		else if(units>200) {
			amount=(50*1.2)+(50*2.4)+(50*3.6)+((units-150)*4.8);
			discount=((amount*5)/100);
			if(discount>200)
				discount=200;
		}
		if(arriar>0) {
			fine=(arriar*10)/100;
		}
		amountPayable=amount+arriar+fine-discount;
		System.out.println("Your electricity bill need to be paid is: ");
		System.out.println("amount: "+amount);
		System.out.println("discount: "+discount);
		System.out.println("arriar: "+ arriar);
		System.out.println("fine on arriar: "+fine);
		System.out.println("Total: "+amountPayable);
	}

}
