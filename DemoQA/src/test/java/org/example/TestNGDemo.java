package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDemo {


    @Test(groups = {"smoke"})
    public void t1(){
        System.out.println("Hello1");
    }

    @Test(groups = {"smoke"})
    public void t2(){
        System.out.println("Hello2");
    }

    @Test
    public void t3() {
        System.out.println("Hello");


    }

    //DataProvider use

    @Test(dataProvider = "getData")
    public void UseDataProvider(String username,String password, int age) {
        System.out.println(username);
        System.out.println(password);
        System.out.println(age);

        System.out.println("------------------------------------------------");


    }

    @DataProvider
    public Object[][] getData(){

        Object[][] data=new Object[2][3];

        //setOne
        data[0][0]="RajatShuklauser1";
        data[0][1]="password1";
        data[0][2]=28;

        //setTwo
        data[1][0]="RahulShuklauser2";
        data[1][1]="password2";
        data[1][2]=26;

        return data;


    }


}
