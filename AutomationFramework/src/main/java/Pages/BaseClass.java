package Pages;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;


public class BaseClass {
    public static WebDriver driver;
    public static Properties properties;
    public BaseClass()  {
        properties=new Properties();
        try {
            FileReader fileReader = new FileReader("D:\\Automation\\Automation-Training\\AutomationFramework\\resources\\config.properties");
            properties.load(fileReader);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void setBrowser(){
        String browser= properties.getProperty("browser");
        if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            ChromeOptions options=new ChromeOptions();
            options.addArguments("force-device-scale-factor=0.90");
            options.addArguments("--start-maximized");
            options.addArguments("--remote-allow-origins=*");
            options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation","disable-infobars"));
            driver=new ChromeDriver(options);
            driver.get(properties.getProperty("url"));

        }
    }

}
