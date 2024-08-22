package selenumPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumBasics1 {
	public static void main(String[] args) {
		//WebDriver driver;
		//driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();//opens a blank chrome window, without url
		//WebDriver d1 = new ChromeDriver();// invalid--> interface cant instatiate/object
		//ChromeDriver d2 = new ChromeDriver(); // valid --> chromedriver is a class and we can create instance of class and object of class
		driver = new EdgeDriver();
	}

}
