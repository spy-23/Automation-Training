package Section_10;

import java.time.Duration;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.className("blinkingText")).click();
		//how to switch from parent to child window
		// first we have to check how many windows are opened using selenium using getWindowHandle
		Set<String> window1=driver.getWindowHandles(); //this will get the id of all the opened window

		java.util.Iterator<String> it=window1.iterator(); //with this , it will iterator and get the all id
		String parentID=it.next(); //with this, parent id will be stored
		String ChildID=it.next(); //with this, child id will be stored
		driver.switchTo().window(ChildID); //with this, switch from parent to child
		System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());
		String emailID=driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentID); //MOVE TO PARENT WINDOW
		driver.findElement(By.id("username")).sendKeys(emailID);
		
		
		
		
		
	
		

	}

}
