package section_11;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		1.Give me the count of link on page
		System.out.println(driver.findElements(By.tagName("a")).size());
//		2.Get me the count of link on footer section
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
//		3.Count the link of first section only for footer section
		
		WebElement first_Section = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(first_Section.findElements(By.tagName("a")).size());
		
		//Click on each link in the column and check if the pages are opening correctly
		
		for(int i=0;i<first_Section.findElements(By.tagName("a")).size();i++)
		{
		String clickonLink=Keys.chord(Keys.CONTROL,Keys.ENTER); //this is used to press the control key first then enter key
		
			
			
			first_Section.findElements(By.tagName("a")).get(i).sendKeys(clickonLink);
			Thread.sleep(4000);	
		}
			Set<String> abc = driver.getWindowHandles(); //will the id of each window
			Iterator<String> it = abc.iterator(); //WILL iterate all the id's
			while(it.hasNext()) //hasNext will tell whether next index is present or not
			{
				driver.switchTo().window(it.next()); //next : will move to next index
				System.out.println(driver.getTitle());
			}
			
		}
	}


