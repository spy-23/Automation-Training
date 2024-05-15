package TestngProject.rajat;

import static org.testng.Assert.assertFalse;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Handling_Static_Dropdowns {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");	
//		// 52 lecture starting
//		//WebElement staticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
////		Select dropDown=new Select(staticDropDown);
////		dropDown.selectByIndex(2);
////		System.out.println(dropDown.getFirstSelectedOption().getText());
//		//52 lecture ending
//		// 53 lecture starting , click on passenger , add the adult, child then click on done button 
//		driver.findElement(By.id("divpaxinfo")).click();
//		for(int i=0;i<4;i++)
//		{
//		driver.findElement(By.id("hrefIncAdt")).click();
//		}
//		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//		
//		driver.findElement(By.id("btnclosepaxoption")).click();
//		
//		// 53 lecture end
//		
//		// 55 lecture start dynamic dropdown
//		
////		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
////		driver.findElement(By.xpath("//a[@value='BLR']")).click();
////		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
//		
//		// 55 lecture end
//		//56 LECTURE START
//		
////		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
////		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
////		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
//		//56 LECTURE end
//		
//		//58 LECTURE START
//		driver.findElement(By.id("autosuggest")).sendKeys("In");
//		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item'] //a"));
//		for(WebElement option:options)
//		{
//			if(option.getText().equals("India"))
//					{
//				option.click();
//				break;
//				
//				}
//		}
//		//58 LECTURE end
//		
//		//60 lecture start
//		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected();
//		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
//		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
//		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected();
//		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
//		
//		//60 lecture end
//		
//		//61 lecture start
//		
//		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
//		Assert.assertEquals(driver.findElements(By.xpath("//input[@type='checkbox']")).size(),6);
//		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
//		//61 lecture end
//		//62 lecture start
//		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-hover']")).click();
//		
//		//62 lecture end
//		
//		//64 lecture start
//		//validating if UI element are disable:
////        System.out.println(driver.findElement(By.id("Div1")).isEnabled()); // this is not working in currently situation
////        driver.findElement(By.id("Div1")).click();
////        System.out.println(driver.findElement(By.id("Div1")).isEnabled()); // this is not working in currently situation
//        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
//        driver.findElement(By.id("Div1")).click();
//        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
//        if(driver.findElement(By.id("Div1")).getAttribute("style").contains(("1")))
//        		{
//        	System.out.println("UI is active");
//        	Assert.assertTrue(true);
//        		}
//        else
//        {
//        	System.out.println("UI is disable");
//        	Assert.assertTrue(false);
//        }
		
//		//68 lecture start handling the alert
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		driver.findElement(By.id("name")).sendKeys("rajat");
//		driver.findElement(By.id("alertbtn")).click();
//	System.out.println(driver.switchTo().alert().getText());
//	driver.switchTo().alert().accept();
//	
	//68 lecture end
		//71 & 72 . 73 74 Lecture start ,  Adding item into the cart:
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] ItemNeeded= {"Cucumber - 1 Kg","Brocolli - 1 Kg"};
		
		List<WebElement> product = driver.findElements(By.className("product-name"));
		for(int i=0;i<product.size();i++)
		{
			//convert array into array list ofr easy search , we can declare array list at first also but array consume low memory 
//			that why we declare array first (Itemneeded) then convert to array list
		
			
			
			String name=product.get(i).getText(); //get() is used to get the index
		
			List ItemList=Arrays.asList(ItemNeeded);
			if(ItemList.contains(name))
				{
					//click on add to cart button
					//with add to cart , there are 30 element and from 30 element we have to click on cucumber that why we used get() method
					
					driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				}
//			if(name.contains("Cucumber"))
//			{
//				//click on add to cart button
//				//with add to cart , there are 30 element and from 30 element we have to click on cucumber that why we used get() method
//				
//				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
//			}
		}
		
		
}
}