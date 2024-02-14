//package driverfactorys;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//public class DriverFactory03 
//{
//		static WebDriver driver;
//	
//		public WebDriver LaunchBrowser(String Browsername)
//		{
//			if(Browsername.equalsIgnoreCase("Chrome"))
//			{
//				 driver = new ChromeDriver();
//			}
//			else if (Browsername.equalsIgnoreCase("Firefox"))
//			{
//				 driver = new FirefoxDriver();
//			}
//			else if (Browsername.equalsIgnoreCase("Edge"))
//			{
//				 driver = new EdgeDriver();
//			}
//			return driver;
//		}
//	
//		public static WebDriver GetDriver()
//		{
//			return driver;
//		}
//
//}
