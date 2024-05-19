import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    public static void main(String[] args ){

        String url = "https://the-internet.herokuapp.com/login";
        String usernameid="tomsmith";
        String passwordid="SuperSecretPassword!";

        //Browser setup
        WebDriver driver = new ChromeDriver();
        //Website Launch
        driver.get(url);

        // finding the username box using ID locator
        By userloc= By.id("username");
        WebElement userbox= driver.findElement(userloc);
        userbox.click();
        userbox.sendKeys(usernameid);


        //finding password box using Name locator
        By passloc= By.name("password");
        WebElement passbox= driver.findElement(passloc);
        passbox.click();
        passbox.sendKeys(passwordid);



        //submit button function using Classname locator
        By sigloc=By.className("fa-2x");
        WebElement sigbtn= driver.findElement(sigloc);
        sigbtn.click();


    //verification user is logged in using CssSelector

    By msgloc= By.cssSelector("div.flash");
    WebElement msgpath = driver.findElement(msgloc);
    System.out.println(msgpath.getText());

    //logout using cssSelector
    By logloc= By.cssSelector(".icon-2x");
    WebElement logpath=driver.findElement(logloc);
    logpath.click();



    //Closing all the associated windows
    driver.quit();



    }





}
