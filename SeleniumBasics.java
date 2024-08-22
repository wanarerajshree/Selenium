package selenumPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumBasics {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();// valid
		ChromeDriver driver1 = new ChromeDriver();// valid
		//WebDriver d1 = new WebDriver();// invalid
		driver = new EdgeDriver();// valid--> its a reassignment the value to webdriver driver	
		//driver1 = new EdgeDriver();// invalid = chrome and edge there is no relationship, webdriver is a parent 
	}

}
