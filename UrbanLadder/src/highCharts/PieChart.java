package highCharts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PieChart {
	@Test
	public static void getPointerText() throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.highcharts.com/demo/pie-basic");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement svg = driver.findElement(By.cssSelector("svg"));
		List<WebElement> outertext = svg.findElements(By.cssSelector("text"));
		Actions act=new Actions(driver);

		                for(WebElement texts : outertext)
		                    {
		                        act.moveToElement(texts).perform();
		                        Thread.sleep(2000);
		                        String toolTiptext=texts.getText();
		                        System.out.println(toolTiptext);
		                    }
	}

}
