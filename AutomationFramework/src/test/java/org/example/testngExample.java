package org.example;

import org.testng.annotations.Test;

public class testngExample {

    @Test(priority = 1,groups = {"sanity"})
    public void test1(){
        System.out.println("test1");
    }
    @Test(priority = 0,groups = {"regression"})
    public void test2(){
        System.out.println("test2");
    }
    @Test(priority = 2,dependsOnMethods = "test1")
    public void test3(){
        System.out.println("test3");
    }
}
