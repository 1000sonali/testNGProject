package Resources;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public WebDriver driver;
	public WebDriver InitialiseDriver() throws IOException
	{
		FileInputStream f1=new FileInputStream("F:\\IACSD2021\\EndToEndDemoNew\\src\\main\\java\\Resources\\Data.properties");
		Properties prop=new Properties();
		prop.load(f1);
		String browsername=prop.getProperty("Browser");
		if(browsername.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\seleniumJars\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equals("Firefox"))
		{
			//firefox code
		}
		else if(browsername.equals("Internet Explorer"))
		{
			//IE code
		}
		return driver;
		
	}

}
/*
 * File-->Project-->Maven-->Maven project-->Next-->all catalogue/internal-->GroupID(Packagename)-->ArtifactID(projectName)

src/test/java-->used for writing test cases
src/main/java-->has our baseclass,page object model.

src/main/java-->create a Baseclass for selenium to launch browser
-->create a file(Data.properties)-->Browser=Chrome

BaseClass.java-->FileInputStream-->Location od Data.properties
properties object-->prop.load(Fileobject)
prop.getProperty("key");
*/
