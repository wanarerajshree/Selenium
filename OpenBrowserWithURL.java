package selenumPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserWithURL {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver is nothing but a browser for me, in this case it is chrome
		//Enter URL into address bar of chrome and press enter
		driver.get("https://www.google.com/");// get is a method
	}

}
