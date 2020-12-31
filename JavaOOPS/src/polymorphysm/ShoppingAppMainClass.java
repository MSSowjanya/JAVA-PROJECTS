package polymorphysm;

import java.util.Scanner;

public class ShoppingAppMainClass {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Playstore store=new Playstore();
		System.out.println("serach for app\n");
		OnlineShoppingApp app=store.downloadAndInstall(scan.next());
		app.Shopping();
	}
}


