package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	//Ctrl + space
	//crtl shift + for increging size
	public static void main(String[] args) {
		// set system propertis
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tspat\\jan2021_selenium\\SeleniumProject\\Drivers\\chromedriver.exe");
	//create an object of chrome browser
		WebDriver driver = new ChromeDriver();
		//WebDriver driver=new InternetExplorerDriver();		//Scanner sccn = new Scanner(System.in);
		driver.get("https://www.google.com/");
		driver.close();
		
	}
	
}
