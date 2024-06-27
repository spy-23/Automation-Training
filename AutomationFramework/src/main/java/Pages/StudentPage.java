package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Utilities;

import java.util.List;

import static Pages.BaseClass.driver;

public class StudentPage {
    public StudentPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    Utilities utilities;
    @FindBy(id="firstName")
    public WebElement fname;
    @FindBy(id="lastName")
    public WebElement lname;
    @FindBy(id="userEmail")
    public WebElement email;
    @FindBy(id="userNumber")
    public WebElement mobile;
    @FindBy(id="dateOfBirthInput")
    public WebElement dob;
    @FindBy(className = "react-datepicker__year-select")
    public WebElement year;
    @FindBy(className = "react-datepicker__month-select")
    public WebElement month;
    @FindBy(xpath = "//input[@id='subjectsInput']")
    public WebElement subjects;
    @FindBy(id="uploadPicture")
    public WebElement uploadBtn;
    @FindBy(id="currentAddress")
    public WebElement address;
    @FindBy(id="state")
    public WebElement state;
    @FindBy(id="city")
    public WebElement city;
    @FindBy(id="submit")
    public WebElement submit;
    @FindBy(id = "example-modal-sizes-title-lg")
    public WebElement assertText;
    @FindBy(id = "closeLargeModal")
    public WebElement closeBtn;

    public WebElement selectGender(String value){
        return driver.findElement(By.xpath("//label[text()='"+value+"']"));
    }
    public WebElement selectDate(String day){
        return driver.findElement(By.xpath("//div[@class='react-datepicker__month']//div[@class='react-datepicker__day react-datepicker__day--0"+day+"']"));
    }
    public WebElement selectHobbies(String option){
        return driver.findElement(By.xpath("//label[text()='"+option+"']"));
    }
    public WebElement selectState(String state){
        return driver.findElement(By.xpath("//div[@class=' css-26l3qy-menu']//div[text()='"+state+"']"));
    }
    public WebElement selectCity(String city){
        return driver.findElement(By.xpath("//div[@class=' css-11unzgr']//div[text()='"+city+"']"));
    }


}


