package HexaviewSalesforce;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class SelectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement first=driver.findElement(By.linkText("Sign up for Facebook"));
		first.click();
		Thread.sleep(2000);
		WebElement name=driver.findElement(By.xpath("//input[@name='firstname']"));
		name.sendKeys("aniket");
		WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("singh");
		WebElement phone=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		phone.sendKeys("9870745227");
		WebElement pass=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		pass.sendKeys("Hexa@1234");
		WebElement day=driver.findElement(By.id("day"));
		Select s=new Select(day);
		s.selectByVisibleText("7");
		WebElement month=driver.findElement(By.id("month"));
		Select s1=new Select(month);
		s1.selectByVisibleText("Sep");
		WebElement year=driver.findElement(By.id("year"));
		Select s3=new Select(month);
		s3.selectByValue("1998");
		
		
		
		
		
	}

}
