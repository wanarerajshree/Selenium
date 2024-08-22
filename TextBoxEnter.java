package selenumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxEnter {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.name("email"));
		WebElement emailAddress = driver.findElement(By.name("email"));
		emailAddress.sendKeys("wanarer92@gmail.com");
		//WebElement passWord = driver.findElement(By.name("pass"));
		//passWord.sendKeys("Rajshree");
		
		/////OR
		driver.findElement(By.name("pass")).sendKeys("Rajshree");
		driver.findElement(By.name("login")).click();	}

}
