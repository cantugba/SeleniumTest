package Test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Script4 { //Ekran kararma sorunu Test

	public static void main(String[] args) throws InterruptedException {
		
		/*WebDriver driver= new FirefoxDriver(); driver.get("Website link");
		driver.findElement(By.id("email")).sendKeys("xyz"); 
		driver.findElement(By.id("password")).sendKeys("xyz"); 
		driver.findElement(By.xpath("//*[text()='Log in']")).click(); 
		driver.findElement(By.xpath("//button[text()='CANCEL']")).click();*/
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//String oldTab = driver.getWindowHandle();
		/*String parentWindowHandler = driver.getWindowHandle();
		String subWindowHandler = null;*/
		driver.manage().window().maximize();
		driver.get("http://live.piton.com.tr/bogazici/employment/profile");
		driver.findElement(By.name("number")).sendKeys("20261734780");
		driver.findElement(By.id("txt_login_pass")).sendKeys("12345Ab+");
		driver.findElement(By.id("m_login_signin_submit")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='m_ver_menu']/ul/li[2]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"page-content\"]/app-root/app-member-layout/div/div/div/div/app-employee-view/piton-portlet/div/div[1]/div[2]/div/ul/li[2]/a")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"page-content\"]/app-root/app-member-layout/div/div/div/div/app-employee-view/piton-portlet/div/div[2]/div/form/div[1]/div[2]/button")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().activeElement();
		driver.navigate().back();
		/*Set<String> handles = driver.getWindowHandles();
		Iterator<String> iterator = handles.iterator();*/
		/*while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}driver.switchTo().window(subWindowHandler);
		/*ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());*/
		
		
		
		
		
		/*Actions actions = new Actions(driver);
         WebElement elementLocator = driver.findElement(By.id("ID"));
actions.doubleClick(elementLocator).perform();*/
		
	}

}
