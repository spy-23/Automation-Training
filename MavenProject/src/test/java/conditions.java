import org.testng.annotations.*;

public class conditions {
    @Test(dependsOnMethods = "Test2", groups = "sanity")
    public void Test1(){
        System.out.println("Test1");
    }

    @Test(groups = "smoke")
    public void Test2(){
        System.out.println("Test2");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass");
    }

    @BeforeTest
    public  void beforeTest(){
        System.out.println("BeforeTest");
    }

    @AfterGroups(groups = "sanity")
    public void afterGroups(){
        System.out.println("After Groups");
    }

    @BeforeGroups(groups = "sanity")
    public void beforeGroups(){
        System.out.println("Before Groups");
    }

    @AfterMethod()
    public void afterMethod(){
        System.out.println("AfterMethod");
    }

    @BeforeMethod()
    public void beforeMethod(){
        System.out.println("BeforeMethod");
    }

}

