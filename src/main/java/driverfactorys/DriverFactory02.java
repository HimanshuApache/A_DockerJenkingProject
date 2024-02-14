//package driverfactorys;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//
//import org.openqa.selenium.Capabilities;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;
//
//public class DriverFactory02 
//{
//	static  WebDriver driver;
//
//	public WebDriver initBrowsers(String browsername) throws MalformedURLException
//	{
//		Capabilities Capable;
//		
//		if(browsername.contains("chrome"))
//		{
//			 Capable = new ChromeOptions();
//		}
//		else	// if (browsername.equals("firefox"))
//		{
//			 Capable = new ChromeOptions();
//		}
////		else if (browsername.equals("Edge"))
////		{
////			Capable = new ChromeOptions();
////		}
//		
//		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), Capable);
//		return driver;
//	}
//	
//	public static WebDriver getDriver()
//	{
//		return driver;
//	}
//
//}
//
//
//
//
//
