package Test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Script5 { //Mail Test

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("http://live.piton.com.tr/bogazici/user/login");
		driver.findElement(By.name("number")).sendKeys("20261734780");
		driver.findElement(By.id("txt_login_pass")).sendKeys("12345Ab+");
		driver.findElement(By.id("m_login_signin_submit")).click();
		driver.findElement(By.xpath("//*[@id='m_ver_menu']/ul/li[2]/a/span")).click();
		driver.get("http://live.piton.com.tr/bogazici/employment/profile");
		driver.findElement(By.xpath("//*[@id=\"page-content\"]/app-root/app-member-layout"
				+ "/div/div/div/div/app-employee-view"
				+ "/piton-portlet/div/div[1]/div[2]/div/ul/li[3]/a")).click();
		/*WebDriverWait wait = new WebDriverWait(driver, 5000);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("_a1307784_408e97c9_87bb8958_7d8e610e_f27c6665")));
		element.sendKeys("valuetobesend");*/
		

	}

}
