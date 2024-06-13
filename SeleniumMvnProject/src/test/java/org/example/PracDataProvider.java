package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PracDataProvider {

    @DataProvider(name="fetchdata")
    public String[][] setdata(){

        String [][] datasetfetch=new String[][]{{"rajat","shukla"},{"rahul","kumar"}};
        return datasetfetch;
    }



    @Test(dataProvider = "fetchdata")
    public void dataFetch(String s1, String s2)
    {
        System.out.println(s1+" "+s2);

    }


}
