package Section_13;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion; 


public class SoftAssert {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert softAssert = new SoftAssert();
		for(WebElement link:links)
		{
			String url=link.getAttribute("href");
			URL open=new URL(url);
			HttpURLConnection conn = (HttpURLConnection)open.openConnection(); //with this method,we can open the connection, send your URL to the internet network and you can get the response
			conn.setRequestMethod("Head");
			conn.connect();
			int res=conn.getResponseCode(); //get the response code
			System.out.println(res);
			softAssert.
//			ass.assertTrue(res<400,"the link that failed"+ link.getText() + " " +  res);
		
			
		}
//		ass.assertAll(); //after executing the all script, using this method , we will report this 
		

	}

}
