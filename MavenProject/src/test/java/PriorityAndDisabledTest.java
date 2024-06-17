
import org.testng.annotations.Test;

public class PriorityAndDisabledTest {
    @Test(priority = 1)
    void test2(){
        System.out.println("test 2");
    }

    @Test
    void test1(){
        System.out.println("test 1");
    }

    @Test
    void test3(){
        System.out.println("test 3");
    }

    @Test(priority = 3)
    void test4(){
        System.out.println("test 6");
    }
}
