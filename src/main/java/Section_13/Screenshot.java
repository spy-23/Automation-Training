package Section_13;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Screenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
	File Src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //to take the screenshot we have to cast the driver as 
	//TakesScreenshot,USE the getScreenshotAs method to take the screenshot,
	FileUtils.copyFile(Src,new File("C:\\Users\\rajat.bhatti\\screenshot.png")); //fileUtils is used to copy the file from souce to our local machine
	

	}

}
