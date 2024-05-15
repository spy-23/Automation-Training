package Section_13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Video105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ChromeOptions option=new ChromeOptions(); //this is used to set the behaviour of your  browser
		 option.setAcceptInsecureCerts(true); // used to accept the unsecure certificate
		 WebDriver driver = new ChromeDriver(option); //pass the option to your driver
		 driver.manage().window().maximize();
		 driver.get("http://expired.badssi.com/");
		 System.out.println(driver.getTitle());
		 
	}
}

