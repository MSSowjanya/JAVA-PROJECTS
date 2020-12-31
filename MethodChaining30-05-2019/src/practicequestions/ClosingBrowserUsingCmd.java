package practicequestions;

import java.io.IOException;

public class ClosingBrowserUsingCmd {

	public static void main(String[] args) {
		try {
			Runtime.getRuntime().exec("taskkill /IM chrome.exe /F");
			System.out.println();
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}
}
