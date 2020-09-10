package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Script2 {//Beni hatýrla

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://live.piton.com.tr/bogazici/user/login");
		WebElement tc =driver.findElement(By.name("number"));
		tc.sendKeys("15409541290");
		WebElement sifre =driver.findElement(By.id("txt_login_pass"));
		sifre.sendKeys("12345Ab+");
		if ( !driver.findElement(By.id("checkbox")).isSelected() )
		{
		     driver.findElement(By.id("checkbox")).click();
		}
		driver.findElement(By.id("m_login_signin_submit")).click();
		Thread.sleep(10000);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("test-type");
		options.addArguments("start-maximized");
		options.addArguments("user-data-dir=D:/temp/");
		capabilities.setCapability("chrome.binary","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		capabilities.setCapability(ChromeOptions.CAPABILITY,options);
		driver.get("http://live.piton.com.tr/bogazici/user/login");
		if((tc == null) && ( sifre == null))
		{
			System.out.println("Cookies oluþturulamadý");
		}
		else
		{
			System.out.println("Cookies oluþturuldu");
		}
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * Ýlk kod örneði
		 * System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("test-type");
		options.addArguments("start-maximized");
		options.addArguments("user-data-dir=D:/temp/");
		capabilities.setCapability("chrome.binary","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		capabilities.setCapability(ChromeOptions.CAPABILITY,options);
		WebDriver driver = new ChromeDriver(capabilities);
		driver.get("http://live.piton.com.tr/bogazici/user/login");
		driver.close();
		driver = new ChromeDriver(capabilities);
		driver.get("http://live.piton.com.tr/bogazici/user/login");
		WebElement tc =driver.findElement(By.name("number"));
		WebElement sifre =driver.findElement(By.id("txt_login_pass"));
		if(driver.findElement(By.id("checkbox")).isSelected())
		{
			if ((tc == null) && (sifre == null))
			{
				System.out.print("Cookies bulunmuyor");
			}
			else
			{
				System.out.print("Cookies bulundu");
			}
		}*/
		
		/*
		 * -------------------------------------------------------------------------------------------------------------
		 * Ýkinci kod örneði
		 * System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://live.piton.com.tr/bogazici/user/login");
		WebElement tc =driver.findElement(By.name("number"));
		tc.sendKeys("15409541290");
		WebElement sifre =driver.findElement(By.id("txt_login_pass"));
		sifre.sendKeys("12345Ab+");
		if ( !driver.findElement(By.id("checkbox")).isSelected() )
		{
		     driver.findElement(By.id("checkbox")).click();
		}
		driver.findElement(By.id("m_login_signin_submit")).click();
		Thread.sleep(10000);
		Set<Cookie> cookies = driver.manage().getCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.navigate().to("http://live.piton.com.tr/bogazici/user/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		if((cookies.size() == 0))
		{
			System.out.println("Cookies oluþturulamadý");
		}
		else
		{
			System.out.println("Cookies oluþturuldu");
		}*/
				
	}

}
