package screenShotPractice;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("WebDriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sfile=ts.getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
		
		WebElement userele=driver.findElement(By.id("username"));
		
		Point point=userele.getLocation();
		int xco=point.getX();
		System.out.println(xco);
		int yco=point.getY();
		System.out.println(yco);
		
		int imgwidth=userele.getSize().getWidth();
		System.out.println(imgwidth);
		int imgheight=userele.getSize().getHeight();
		System.out.println(imgheight);
		
		BufferedImage img=ImageIO.read(sfile);
		BufferedImage desc=img.getSubimage(xco, yco, imgwidth, imgheight);
		ImageIO.write(desc, "png", sfile);
		File dsrc=new File("./screenshots/selenium.png");
		FileUtils.copyFile(sfile, dsrc);
		driver.close();

	}

}
