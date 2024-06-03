import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class TestNG {
    @BeforeTest(groups = {"sanity", "smoke", "exhaustive"})
    public void setup(){
        System.out.println("we will setup driver and link");
    }

    @Test(groups = {"sanity"})
    public void sanityTest() {
        // Test steps for sanity test
        System.out.println("Sanity Test Cases");
    }

    @Test(groups = {"smoke"})
    public void smokeTest() {
        // Test steps for smoke test
        System.out.println("Smoke Test Cases");
    }

    @Test(groups = {"exhaustive"})
    public void exhaustiveTest() {
        // Test steps for exhaustive test
        System.out.println("Exhaustive test Cases");
    }


    @AfterTest(groups = {"sanity", "smoke", "exhaustive"})
    public void tearDown() {
        // Close the browser window
        System.out.println("close the driver");
    }

}
