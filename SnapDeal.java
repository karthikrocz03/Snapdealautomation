package seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.snapdeal.com/");
		 driver.findElement(By.xpath("//div[@class='accountInner']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.linkText("LOGIN")).click();
		 Thread.sleep(3000);
		 driver.switchTo().frame(driver.findElement(By.id("loginIframe")));
		driver.findElement(By.xpath("//div[@class='number-prefix number-prefix-disable']//input[@class='col-xs-24' and @placeholder='Mobile Number/ Email']")).sendKeys("karthikrocz03@gmail.com");
		driver.findElement(By.xpath("//button[@id='checkUser']")).click();

}
}
