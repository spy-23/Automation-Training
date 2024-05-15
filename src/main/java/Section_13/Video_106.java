package Section_13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Video_106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies(); //to delete all the cookied
//		driver.manage().deleteCookieNamed("sd"); //delete the specific cookied
		driver.get("https://studio.youtube.com/channel/UCqMsNXXf4Gm_h1Re-rSICrQ");
		
		
		

	}

}
