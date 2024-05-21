package AllLocatorsPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFlipkart {

    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Puma sneakers");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        String title = driver.findElement(By.xpath("//a[@title=\"Popcat 20 Shower RES Men Slides\"]")).getText();
        System.out.println("Name of item is : "+ title );

          }

}
