package Test1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script3 { //TC girdi

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://live.piton.com.tr/bogazici/user/login");
		//driver.findElement(By.name("number")).sendKeys("122345432");
		WebElement tc =driver.findElement(By.name("number"));
		tc.sendKeys("12341");
		if(tc.getAttribute("value").length() == 11)
		{
			System.out.print("Tc kimlik numarasý doðru girildi.");
		}
		else
		{
			System.out.print("Tc kimlik yanlýþ girildi");
		}

	}

}
