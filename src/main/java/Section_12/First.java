package Section_12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import sun.awt.SunHints.Value;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver; //casting your driver to javascriptExecutor
		js.executeScript("window.scrollBy(0,500)"); // this is used to scroll the window (complete browser will scroll) 
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=200");// first we focus on the element then using scroll , scroll the element and this is for specific element
		List<WebElement> value = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		for(int i=0;i<value.size();i++)
		{
		sum=sum+Integer.parseInt(value.get(i).getText());
			//this is used to print the value at i index and also convert the string into int
		}
		System.out.println(sum);
	int total=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
	Assert.assertEquals(sum, total);
		
//		Assert?

	}

}
