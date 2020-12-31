package polymorphysm;

public class Playstore {
	OnlineShoppingApp downloadAndInstall(String type) {
		if(type.equals("Myntra"))
			return new Myntra();
		else if (type.equals("Nykaa"))
			return new Nykaa();
		else if (type.equals("BigBasket"))
			return new BigBasket();
	return null;
	}
}
