package partner_portal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	
	public  static WebDriver driver;
	public static void main(String[] args) {
		
			LogintoDashboard();
			OfflineCampaigns_banner();
	}
			
	public static  void LogintoDashboard() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		
	// Test case to check login page
		driver.get("https://billmepartner.com/");															// Website URL
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String title = driver.getTitle();
		if("BillMe Partner".equals(title)) {
			System.out.println("Right page");
		}else { 
			System.out.println("incorrect page");
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("rohit@billme.co.in"); 
		System.out.println("email entered");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div/div/form[1]/button")).click(); 
		System.out.println("OTP sent");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String title_dashboard = driver.getCurrentUrl();
		
		if("https://billmepartner.com/dashboard".equals(title_dashboard)) {
			System.out.println("login success");
		} else {
			System.out.println("login fail");
		}
				
	}
	public static void OfflineCampaigns_banner() {
			
		driver.get("https://billmepartner.com/auto-engage/bannerInBill");
		String BannerPage = driver.getCurrentUrl();
		
		if("https://billmepartner.com/auto-engage/bannerInBill".equals(BannerPage)) {
			System.out.println("Success !! on Banner in bill Page");
		} else {
			System.out.println("Banner in page load failure");
		}
				
	}
		
	}


