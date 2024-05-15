package section_11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Handling_Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String MonthNumber="6";
		String date="15";
		String year="2024";
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector(".react-date-picker__wrapper")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElements(By.cssSelector(".react-calendar__tile")).get(Integer.parseInt(MonthNumber)-1).click();
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
		System.out.println(driver.findElement(By.cssSelector(".react-date-picker__wrapper")));	
		List<WebElement> Actual = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		String[] expected= {MonthNumber,date,year}; //array for expected value
		for(int i =0;i<Actual.size();i++)
		{
		System.out.println(Actual.get(i).getAttribute("value"));		
		Assert.assertEquals(Actual.get(i).getAttribute("value"), expected[i]);
		}
		driver.close();
       
       
		
	}

}
