package com.selenium.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageLocators {

    public WebDriver ldriver;

    public  LoginPageLocators(WebDriver driver){
        this.ldriver=driver;
        PageFactory.initElements(ldriver,this);
    }


    @FindBy(id="username")
   private WebElement username;

    @FindBy(id="password")
    private WebElement paas;

    @FindBy(id="submit")
    private WebElement submitbutton;


    public void tl(){
        System.out.println("hello");
    }

    public void UserNameSet(String uname){
        username.click();
        username.sendKeys(uname);
    }


    public void Passwordset(String password) {

        paas.click();
        paas.sendKeys(password);
    }


    public void submit() {
        submitbutton.click();
    }
}
