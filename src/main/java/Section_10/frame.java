package Section_10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frame {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable");
		 //count the total iframe in a webpage
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); // which from window to frame
		driver.findElement(By.id("draggable")).click();
		Actions a =new Actions(driver); //used to prform the actions
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform(); //dragAndDrop is used to drag and drop the element using source address and target address
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().defaultContent();//move to default window
	}

}
