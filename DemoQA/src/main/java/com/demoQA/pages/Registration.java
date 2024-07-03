package com.demoQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Registration {


    private WebDriver driver;


    @FindBy(id = "firstName") // Replace with appropriate locator
    private WebElement firstName;

    @FindBy(id = "lastName") // Replace with appropriate locator
    private WebElement lastName;


    @FindBy(id = "userEmail") // Replace with appropriate locator
    private WebElement emailfield;


    @FindBy(xpath = "//label[@for='gender-radio-1']") // Replace with appropriate locator
    private WebElement genderSelect;


    @FindBy(id = "userNumber") // Replace with appropriate locator
    private WebElement mobileNumber;


  @FindBy(id="dateOfBirthInput")
    private WebElement dataPick;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-1']") // Replace with appropriate locator
    private WebElement hobbiesSelect;

    @FindBy(className="subjects-auto-complete__control")
    private WebElement subject;
    //.subjects-auto-complete__control

    //label[@for='hobbies-checkbox-1']

    public Registration(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setfName(String fName){
        firstName.sendKeys(fName);
    }

    public void setlName(String lName){
        lastName.sendKeys(lName);
    }
    public void setEmail(String email){
        emailfield.sendKeys(email);
    }

    public void setGender(){
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
//        WebElement myElement = driver.findElement(By.xpath("//input[@id='gender-radio-1']"));  // Replace with your locator
//        wait.until(ExpectedConditions.elementToBeClickable(myElement));
        genderSelect.click();
    }

    public void setMobileNumber(String number){
        mobileNumber.sendKeys(number);
    }

    public void setSubject(){
        subject.sendKeys("Hindi,English");
    }


    public void setDate(){
        dataPick.click();
        dataPick.clear();
        dataPick.sendKeys("04 nov 1995");
    }

    public void setHobbies(){
        hobbiesSelect.click();
    }


}
