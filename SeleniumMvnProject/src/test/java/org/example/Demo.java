package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {


    //@BeforeTest
    @BeforeMethod
    public void add(){
        System.out.println("before");
    }


    @Test
    public void T1(){
        System.out.println("Test1111");
    }

    @Test
    public void T2(){
        System.out.println("Test2222");
    }

    //@AfterTest
    @AfterMethod
    public void tear(){
        System.out.println("Tear down the app");
    }


}
