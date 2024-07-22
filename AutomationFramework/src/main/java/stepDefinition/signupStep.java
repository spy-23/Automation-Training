package stepDefinition;

import Pages.MainPage;
import Pages.PracticeFormPage;
import Pages.StudentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import utilities.ExcelMapper;
import utilities.ReadExcel;
import utilities.Utilities;
import java.io.IOException;
import java.util.Arrays;


public class signupStep {

    public static WebDriver driver;
    ExcelMapper data;
    Utilities utilities;
    MainPage mainPage;
    PracticeFormPage practiceFormPage;
    StudentPage studentPage;

    @Given("I read data from excel row number {int}")
    public void iReadDataFromExcelRowNumber(int i) {
        data=ReadExcel.excelReader(i);
    }
    @Given("I setup the new browser")
    public void i_setup_the_new_browser() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("force-device-scale-factor=0.80");
        options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation","disable-infobars"));
        driver=new ChromeDriver(options);
        driver.get("https://demoqa.com/");
        utilities=new Utilities();
        mainPage=new MainPage(driver);
        practiceFormPage=new PracticeFormPage(driver);
        studentPage=new StudentPage(driver);

    }
    @And("I enter required Personal details")
    public void iEnterRequiredPersonalDetails() {
        utilities.waits(driver, mainPage.formBtn, "toClick");
        utilities.scrollToWebElement(driver, mainPage.formBtn);
        utilities.clickElement(driver, mainPage.formBtn);
        utilities.waits(driver, practiceFormPage.practiceformBtn, "toClick");
        utilities.clickElement(driver, practiceFormPage.practiceformBtn);
        utilities.waits(driver, studentPage.fname,"toVisible");
        studentPage.fname.sendKeys(data.getFirstname());
        studentPage.lname.sendKeys(data.getLastname());
        studentPage.email.sendKeys(data.getEmail());
        utilities.scrollToWebElement(driver,studentPage.selectGender(data.getGender()));
        utilities.visibleElement(driver, studentPage.selectGender(data.getGender()));
        studentPage.mobile.sendKeys(data.getMobilenumber());
        utilities.clickElement(driver,studentPage.dob);
        utilities.dropdownSelectByVisibleText(studentPage.year,data.getYear());
        utilities.dropdownSelectByVisibleText(studentPage.month,data.getMonth());
        utilities.clickElement(driver,studentPage.selectDate(data.getDate()));
        utilities.clickElement(driver,studentPage.subjects);
        studentPage.subjects.sendKeys(data.getSubject1());
        utilities.enterBtnPress(driver);
        utilities.clickElement(driver,studentPage.selectHobbies(data.getHobbies()));
        studentPage.uploadBtn.sendKeys(data.getPicture());
        studentPage.address.sendKeys(data.getAddress());
        utilities.scrollToWebElement(driver,studentPage.state);
        utilities.clickElement(driver,studentPage.state);
        utilities.clickElement(driver,studentPage.selectState(data.getState()));
        utilities.waits(driver,studentPage.city,"toClick");
        utilities.clickElement(driver, studentPage.city);
        utilities.clickElement(driver,studentPage.selectCity(data.getCity()));
        utilities.clickElement(driver, studentPage.submit);

    }

    @Then("I verify form is filled")
    public void i_verify_form_is_filled() {
        Assert.assertEquals(studentPage.assertText.getText(),"Thanks for submitting the form");

    }
    @Then("I take screenshot")
    public void i_take_screenshot() throws IOException {
        utilities.screenshot(driver);

    }
    @Then("I close the new browser")
    public void i_close_the_new_browser() {
        utilities.scrollToWebElement(driver,studentPage.closeBtn);
        utilities.clickElement(driver,studentPage.closeBtn);
        driver.close();

    }

}
