package listBox;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class ListBoxDataValidation {
	@Test
	public static void check() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mediacollege.com/internet/samples/html/country-list.html");
		
		Thread.sleep(2000);
		WebElement listBox=driver.findElement(By.xpath("//select[@name='country']"));
		listBox.click();
		
		Select sel=new Select(listBox);
		
		List<WebElement> lst=sel.getOptions();
		List<String> countryList=new ArrayList<String>(); 
		for(WebElement wb:lst) {
			countryList.add(wb.getText());
		}
		Set<String> set=new HashSet<String>(countryList);
		SoftAssert s=new SoftAssert();
		s.assertEquals(set.size(), lst.size());
		System.out.println("Set size: "+set.size());
		System.out.println("List size: "+lst.size());
		
		TreeSet<String> tset=new TreeSet<String>(countryList);
		s.assertEquals(countryList, tset);
		
		
		
		driver.close();
	}
	

}
