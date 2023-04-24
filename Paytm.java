package Justpay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paytm {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://paytm.com/");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@class='_1YPz_']")).click();
		driver.findElement(By.xpath("//img[@src='https://assetscdn1.paytm.com/images/catalog/view_item/733299/1626251017535.png']")).click();
		driver.findElement(By.xpath("//input[@autocomplete='new-password'][@type='text']")).sendKeys("10");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class=\"_11kC  _15qf _2qE6\"]")).click();
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//p[@class='ptm-paymode-name '][text()='Axis Bank Credit Card']")).click();
//		Thread.sleep(1500);
//		driver.findElement(By.xpath("//input[@id='ppbl_pin'][@type='tel']")).sendKeys("xxxx");
//		Thread.sleep(1000);
		
//		driver.findElement(By.xpath("//*[text()='Pay ₹10']")).click();
	}

}
