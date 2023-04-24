package Justpay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Justpay1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Eclips\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.swiggy.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("798787544822");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='a-ayg']")).click();
		driver.findElement(By.xpath("//input[@class='_381fS'][@type='text']")).sendKeys("jyotish");
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("abcdakj6574@gmail.com");
		driver.findElement(By.linkText("CONTINUE")).click();
		
		//Try to do payment
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='_3p4qh']")).click();
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("7987544822");
		driver.findElement(By.linkText("LOGIN")).click();
		Thread.sleep(15000);
		
		
		driver.findElement(By.linkText("VERIFY OTP")).click();
		driver.findElement(By.xpath("//a[@title='View Account']")).click();
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		driver.findElement(By.xpath("//div[@class='_3p8Mf']")).click();
		driver.findElement(By.xpath("//input[@class='zo3Qq'][@placeholder='CVV']")).sendKeys("123");
		driver.findElement(By.xpath("//div[@class='_2ZJ0s _2akhP']")).click();
		
		
		
		
	}

}
