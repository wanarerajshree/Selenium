package selenumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("wanarer92@gmail.com");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("pass@1");
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
	}

}
