package testngtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testingtest {

	public WebDriver driver;

	@BeforeMethod

	public void launch() {
		System.setProperty("webdriver.chrome.driver", "E:\\chrome78\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.protonmail.com/login");

		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("abisheksrinivasan@protonmail.com");
		driver.findElement(By.name("password")).sendKeys("06121995");
		driver.findElement(By.id("login_btn")).click();
	}

	@Test
	@Parameters({ "username", "password" })
	public void verifylogin(String username, String password) {
		driver.findElement(By.id("txtusername")).sendKeys(username);
		driver.findElement(By.id("txtpassword")).sendKeys(password);
		driver.findElement(By.id("btnlogin")).click();
	}
}