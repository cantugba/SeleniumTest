package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 { //Login Kontrol

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://live.piton.com.tr/bogazici/user/login");
		driver.findElement(By.name("number")).sendKeys("1540951290");
		driver.findElement(By.id("txt_login_pass")).sendKeys("12345Ab+");
		driver.findElement(By.id("m_login_signin_submit")).click();
		Thread.sleep(5000);
		String expected= driver.getTitle();
		driver.quit();
		if(expected.equals("Pano"))
		{
			System.out.print("Giri� i�lemi ba�ar�l�d�r.");
		}
		else if(expected.equals("Bo�azi�i M�hendislik"))
		{
			System.out.print("Giri� i�lemi ba�ar�s�zd�r");
		}
		else
		{
			System.out.print("Y�nlendirme yanl�� sayfaya yap�lm��t�r.");
		}
			
	}

}
