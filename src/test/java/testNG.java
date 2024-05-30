import org.testng.annotations.Test;

public class testNG {


    @Test(priority = 1)
    public void test1(){
        System.out.println("Hello test1");
    }

    @Test (priority = 0)
    public void test2(){
        System.out.println("Hello test2");
    }
    @Test(priority = 2)
    public void test3(){
        System.out.println("Hello test3");
    }
}
