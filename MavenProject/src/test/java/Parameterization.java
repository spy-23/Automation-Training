import com.beust.jcommander.Parameter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
   public static WebDriver driver;

    @Test
    @Parameters({"Website"})
    public void test1(String Website){
        driver = new ChromeDriver();
        driver.get(Website);
    }
}
