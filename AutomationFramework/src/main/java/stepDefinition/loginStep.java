package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;


public class loginStep {
    public static WebDriver driver;
    @Given("I setup the browser")
    public void i_setup_the_browser() {
        // Write code here that turns the phrase above into concrete actions
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--remote-allow-origins=*");
        options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation","disable-infobars"));
        driver=new ChromeDriver(options);
        driver.get("https://app.qa.klondikefinancial.com");

    }
    @And("I fill the login details")
    public void i_fill_the_login_details() throws InterruptedException {
        Thread.sleep(5000);
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("normal_login_username")).sendKeys("abhi1406");
        driver.findElement(By.xpath("//button[@type='submit']")).sendKeys("Hexa@1234");

    }
    @And("I click on Login button")
    public void i_click_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }
    @Then("I close the browser")
    public void i_close_the_browser() {
        // Write code here that turns the phrase above into concrete actions
        driver.close();
    }
}
