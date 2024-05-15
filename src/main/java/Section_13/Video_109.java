package Section_13;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Video_109 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String url=driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
		URL open=new URL(url);
		HttpURLConnection conn = (HttpURLConnection)open.openConnection(); //with this method,we can open the connection, send your URL to the internet network and you can get the response
		conn.setRequestMethod("Head");
		conn.connect();
		int res=conn.getResponseCode(); //get the response code
		System.out.println(res);
		
	}

}
