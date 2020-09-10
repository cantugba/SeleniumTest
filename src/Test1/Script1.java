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
			System.out.print("Giriþ iþlemi baþarýlýdýr.");
		}
		else if(expected.equals("Boðaziçi Mühendislik"))
		{
			System.out.print("Giriþ iþlemi baþarýsýzdýr");
		}
		else
		{
			System.out.print("Yönlendirme yanlýþ sayfaya yapýlmýþtýr.");
		}
			
	}

}
