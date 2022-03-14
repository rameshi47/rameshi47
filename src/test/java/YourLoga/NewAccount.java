package YourLoga;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewAccount {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//		Creating Account

		driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
		driver.findElement(By.xpath("//input[@name='email_create']")).sendKeys("babustark1212@gmail.com");
		driver.findElement(By.xpath("//span[normalize-space()='Create an account']")).click();
		driver.findElement(By.xpath("//label[@for='id_gender1']//input[@name='id_gender']")).click();

		driver.findElement(By.xpath("//input[@name='customer_firstname']")).sendKeys("Ram");
		driver.findElement(By.xpath("//input[@name='customer_lastname']")).sendKeys("Bob");
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("Bahadur");
		// driver.findElement(By.xpath("//select[@name='days']//option[@value='2']")).click();
		// driver.findElement(By.xpath("//select[@name='months']//option[@value='10']")).click();
		// driver.findElement(By.xpath("//select[@name='years']//option[@value='1999']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ram");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("bob");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("No;40,ranganathapuram, coimbature");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("coimbatore");
		driver.findElement(By.xpath("//input[@name='phone_mobile']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//select[@id='id_state']/..//option[normalize-space()='Indiana']")).click();
		driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys("64140");
		driver.findElement(By.xpath("//select[@name='id_country']/..//option[normalize-space()='United States']"));
		driver.findElement(By.xpath("//input[@name='alias']")).sendKeys("coimbatore");
		driver.findElement(By.xpath("//span[normalize-space()='Register']")).click();


	}

}
