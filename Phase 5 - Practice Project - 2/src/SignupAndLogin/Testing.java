package SignupAndLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testing {

	private static String url = "http://localhost:4200";

	WebDriver webdriver = null;

	
	@BeforeTest
	public void start() {
		System.setProperty("webdriver.chrome.driver", "G:\\mphasis\\FSD Training\\Tools\\chromedriver_win32\\chromedriver.exe");
		webdriver = new ChromeDriver();
	}
	
	@Test(priority=0)
	public void signupform() {
		String route = "signup";
		webdriver.get(url + "/" + route);
		
		webdriver.findElement(By.id("fullname")).sendKeys("Akash");		
		System.out.println("fullname Enter successfully");
		
		webdriver.findElement(By.id("number")).sendKeys("8562314710");
		System.out.println("Mobile Number enter successfully");
		
		webdriver.findElement(By.id("email")).sendKeys("akash@gmail.com");	
		System.out.println("Email enter successfully");
		
		webdriver.findElement(By.id("password")).sendKeys("123456");
		System.out.println("Password enter successfully");
		
		webdriver.findElement(By.name("register")).click();
		System.out.println("Signup successfully");
		System.out.println();
		System.out.println();

	}
	
	@Test(priority=1)
	public void Login() {
		String route = "login";
		webdriver.get(url + "/" + route);
		
		webdriver.findElement(By.id("email")).sendKeys("thoufiq@gmail.com");
		System.out.println("Email field is filled");
		
		webdriver.findElement(By.id("password")).sendKeys("123456");
		System.out.println("Password field is filled");
		
		webdriver.findElement(By.name("login")).click();

		System.out.println("Login successfully");
		System.out.println();
	}
	
	@Test(priority=2)
	public void Addtocart() throws InterruptedException {

		String route = "dashboard";
		webdriver.get(url + "/" + route);
		Thread.sleep(1000);

		webdriver.findElement(By.id("addemployee")).click();
		System.out.println("Add button is clicked");
		
		
		webdriver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Hansa");
		System.out.println("FirstName is added");
		
		webdriver.findElement(By.id("lastname")).sendKeys("Thasleem");
		System.out.println("LastName is added");
		
		webdriver.findElement(By.id("emailid")).sendKeys("hansa@gmail.com");
		System.out.println("Email is added");
		
		webdriver.findElement(By.id("number")).sendKeys("8680073629");
		System.out.println("Mobile number is added");
		
		
		webdriver.findElement(By.id("salary")).sendKeys("100000");
		System.out.println("Salary is added");
		
		webdriver.findElement(By.id("add")).click();
		System.out.println("List is added to the cart");
	}
	
	
	@AfterSuite
	public void end() {
		webdriver.close();
		System.out.println("Testing Ended successfully");
	}
	
}




