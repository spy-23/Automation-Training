package org.example.demo;

import Pages.BaseClass;
import Pages.MainPage;
import Pages.PracticeFormPage;
import Pages.StudentPage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.*;
import utilities.Utilities;

import java.io.IOException;


public class SignupTest extends BaseClass {
    MainPage mainPage;
    PracticeFormPage practiceFormPage;
    StudentPage studentPage;
    Utilities utilities;

    @BeforeMethod
    public void initialization(){
            setBrowser();
            mainPage =new MainPage(driver);
            practiceFormPage=new PracticeFormPage(driver);
            studentPage=new StudentPage(driver);
            utilities=new Utilities();

        }
    @Test(dataProvider = "readExcelDetails",dataProviderClass = formDetailsDP.class)

    public void practicesignupTest(String first,String last,String email,String gender,String mobile,String year,String month,String date,String subject1,String subject2,String hobbies,String picture,String addr,String state,String city) throws IOException {


        utilities.waits(driver, mainPage.formBtn, "toClick");
        utilities.scrollToWebElement(driver, mainPage.formBtn);
        utilities.clickElement(driver, mainPage.formBtn);
        utilities.waits(driver, practiceFormPage.practiceformBtn, "toClick");
        utilities.clickElement(driver, practiceFormPage.practiceformBtn);
        utilities.waits(driver, studentPage.fname,"toVisible");
        studentPage.fname.sendKeys(first);
        studentPage.lname.sendKeys(last);
        studentPage.email.sendKeys(email);
        utilities.scrollToWebElement(driver,studentPage.selectGender(gender));
        utilities.visibleElement(driver, studentPage.selectGender(gender));
        studentPage.mobile.sendKeys(mobile);
        utilities.clickElement(driver,studentPage.dob);
        utilities.dropdownSelectByVisibleText(studentPage.year,year);
        utilities.dropdownSelectByVisibleText(studentPage.month,month);
        utilities.clickElement(driver,studentPage.selectDate(date));
        utilities.clickElement(driver,studentPage.subjects);
        studentPage.subjects.sendKeys(subject1);
        utilities.enterBtnPress(driver);
        utilities.clickElement(driver,studentPage.selectHobbies(hobbies));
        studentPage.uploadBtn.sendKeys(picture);
        studentPage.address.sendKeys(addr);
        utilities.scrollToWebElement(driver,studentPage.state);
        utilities.clickElement(driver,studentPage.state);
        utilities.clickElement(driver,studentPage.selectState(state));
        utilities.waits(driver,studentPage.city,"toClick");
        utilities.clickElement(driver, studentPage.city);
        utilities.clickElement(driver,studentPage.selectCity(city));
        utilities.clickElement(driver, studentPage.submit);
        Assert.assertEquals(studentPage.assertText.getText(),"Thanks for submitting the form");
        System.out.println("Test Passed");
        utilities.screenshot(driver);
        utilities.scrollToWebElement(driver,studentPage.closeBtn);
        utilities.clickElement(driver,studentPage.closeBtn);


    }
    @AfterMethod
    public void closeBrowser(){
       driver.close();
    }

}

