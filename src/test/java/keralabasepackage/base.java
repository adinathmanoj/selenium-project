package keralabasepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import keralapagepackage.loginpage;

public class base {
	
		
		public static WebDriver driver;
		
		public loginpage loginobj;
		
		@BeforeTest
		public void setup() {
			driver =new ChromeDriver();
			driver.get("https://keralaproperty.in/member/login/");
			driver.manage().window().maximize();
		}

		@BeforeMethod
		public void objectmethod() {
			
			loginobj = new loginpage(driver);
			
		}
}