package windowHandlesNaukri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Naukri {
	@Test
	public void get() throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		Set<String> windowId=driver.getWindowHandles();
		int count=0;
		for(String handle:windowId) {
			driver.switchTo().window(handle);
            Thread.sleep(1000);
            System.out.println("Title of the new window: " +driver.getTitle());
            count++;
		}
		
		LinkedList<String> list = new LinkedList<>(windowId);
		Iterator<String> itr = list.descendingIterator();
		System.out.println("In Reverse order");
		//To close windows in reverse order
		while(itr.hasNext()) {
			
			driver.switchTo().window(itr.next());
			System.out.println(driver.getTitle());
			driver.close();
		}
		//To close alternate windows in reverse order
		WebDriver driver1=new FirefoxDriver();
		driver1.get("https://www.naukri.com/");
		
		Set<String> windowId1=driver1.getWindowHandles();
		int j=0;
		String arr[]=new String[windowId1.size()];
		for(String str:windowId1) {
			arr[j++]=str;
		}
			
		for(int i=arr.length-1;i>=0;i-=2) {
			driver1.switchTo().window(arr[i]);
			driver1.close();	
		}
		for(int i=arr.length-2;i>=0;i-=2) {
			driver1.switchTo().window(arr[i]);
			driver1.close();
		}
		//To close the first and fourth window
		WebDriver driver2=new FirefoxDriver();
		driver2.get("https://www.naukri.com/");
		
		Set<String> windowId2=driver2.getWindowHandles();
		int k=0;
		String arr1[]=new String[windowId2.size()];
		for(String str:windowId2) {
			arr1[k++]=str;
		}
		for(int i=arr1.length-1;i>=0;i--) {
			driver2.switchTo().window(arr1[i]);
			if(i==0 || i==3) {
				driver2.close();
			}
		}
	}

}
