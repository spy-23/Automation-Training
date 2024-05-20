import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.get("https://vinothqaacademy.com/mouseevent/");
        driver.manage().window().maximize();

        WebElement inputboxloc = driver.findElement(By.id("textbox"));

        Actions builder=new Actions(driver);

        builder.moveToElement(inputboxloc)
                .click()
                .keyDown(inputboxloc, Keys.SHIFT) // SHift key press to send the char in upper case
                .sendKeys("hello")// send the char
                .keyUp(inputboxloc,Keys.SHIFT)// release the key after the use
                .doubleClick(inputboxloc)// double click on the locator
                .contextClick(inputboxloc)// right click on the locator
                .build().perform();// build and perform will initiate the mouse action on the element


        WebElement doubleclick=driver.findElement(By.id("dblclick"));
        builder.doubleClick(doubleclick)
                .build().perform();


        WebElement rightclick=driver.findElement(By.id("rightclick"));
        builder.contextClick(rightclick).build().perform();


        WebElement sourcedrag= driver.findElement(By.xpath("//div[@id='draggableElement']"));
        WebElement targetdrag=driver.findElement(By.xpath("//div[@id='droppableElement']"));

        sourcedrag.click();

        builder.dragAndDrop(sourcedrag,targetdrag).build().perform();








    }




}
