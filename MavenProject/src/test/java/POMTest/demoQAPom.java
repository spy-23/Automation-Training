package POMTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

public class demoQAPom {
    private WebDriver driver;
    @FindBy(xpath = "//h5[text()=\"Elements\"]")
    WebElement elements;
    JavascriptExecutor js;

    void clickElements(){
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()",elements);

        elements.click();
    }

    @FindBy(xpath="//*[text()=\"Text Box\"]")
    WebElement textBox;

    public void clickTextBox(){
        textBox.click();
    }

    @FindBy(id="userName")
    WebElement userName;

    public  void enterUserName(){
        userName.sendKeys("Akshat");
    }

    @FindBy(id="userEmail")
    WebElement userEmail;

    public  void enterUserEmail(){
        userEmail.sendKeys("Akshat.abc@google.com");
    }

//    permanentAddress
    @FindBy(id="currentAddress")
    WebElement currentAddress;

        public  void enterCurrentAddress(){
            currentAddress.sendKeys("Noida, UP");
        }

    @FindBy(id="permanentAddress")
    WebElement permanentAddress;

    public  void enterPermanentAddress(){
        permanentAddress.sendKeys("Pune, MH");
    }

    @FindBy(id = "submit")
    private WebElement submitButton;

    public void clickSubmitButton(){
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()",submitButton);
        submitButton.click();
    }

    demoQAPom (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


}
