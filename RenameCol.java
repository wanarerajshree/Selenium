package selenumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RenameCol {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.mammoth.io/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("wanarer92@gmail.com");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Sankalp@98");
		Thread.sleep(30000);
		WebElement login = driver.findElement(By.xpath("//div[@class='mm-button--content']"));
		login.click();
		Thread.sleep(15000);
		WebElement view1 = driver.findElement(By.xpath("//div[@class='row m-0 view-title']"));
		view1.click();
		Thread.sleep(15000);
		WebElement open = driver.findElement(By.xpath("//span[@class='open-btn-padding ng-scope']"));
		open.click();

		

	}
}


