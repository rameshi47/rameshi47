package YourLoga;

import org.openqa.selenium.By;

public class Login extends NewAccount{
	public static void main(String[] args) {


//      Login

		driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("babustark1212@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Bahadur");
		driver.findElement(By.xpath("//span[normalize-space()='Sign in']")).click();
	}

}
