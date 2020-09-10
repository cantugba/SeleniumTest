package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class asis {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://81.214.248.33:1011/Login");
		WebElement kadi=driver.findElement(By.id("UserName"));
		Thread.sleep(3000);
		kadi.sendKeys("admin");
		WebElement sifre=driver.findElement(By.id("Password"));
		Thread.sleep(5000);
		sifre.sendKeys("123456");
		Thread.sleep(5000);
		driver.findElement(By.id("m_login_signin_submit")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"m_ver_menu\"]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"m_ver_menu\"]/ul/li[2]/div/ul/li[3]/a")).click();
		Thread.sleep(5000);
		WebElement name=driver.findElement(By.xpath("//*[@id=\"Name\"]"));
		name.sendKeys("newNVR");
		Thread.sleep(3000);
		WebElement ip=driver.findElement(By.name("Ip"));
		ip.sendKeys("172.16.40.12");
		Thread.sleep(3000);
		WebElement port=driver.findElement(By.name("Port"));
		port.sendKeys("5555");
		Thread.sleep(3000);
		WebElement username=driver.findElement(By.xpath("//*[@id=\"UserName\"]"));
		username.sendKeys("admin");
		Thread.sleep(3000);
		WebElement sifrep=driver.findElement(By.xpath("//*[@id=\"Password\"]"));
		sifrep.sendKeys("adminadmin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"main-form\"]/div[2]/div/div/div/button")).click();
		
		
		

	

	}

}
