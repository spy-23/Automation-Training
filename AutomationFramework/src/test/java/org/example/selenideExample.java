package org.example;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;
import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class selenideExample {
@BeforeTest
public void openBrowser(){
    Configuration.browser="firefox";
}
@Test
    public void login(){

    open("https://app.qa.klondikefinancial.com/");
    $("#normal_login_username").shouldBe(clickable).setValue("abhi1406");
    $(By.xpath("//input[@type='password']")).shouldBe(clickable, Duration.ofSeconds(30)).setValue("Hexa@1234");
    $(By.xpath("//button[@type='submit']")).click();
    $("li").shouldHave(text("Home"),Duration.ofSeconds(5));

    }
}
