package googleTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleTest {
@Test
public void Googletest() throws IOException{
	WebDriver wd=new FirefoxDriver();
	wd.manage().window().maximize();
	wd.get("https://www.google.co.in/");
	File src=((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("G:\\JAVA\\64bit\\eclipse\\Googletest\\screenshot\\test.jpg"));
	
	
}
}
