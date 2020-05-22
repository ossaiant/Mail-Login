package loginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mcanthony\\Desktop\\browserdrivere\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
        driver.get("https://accounts.google.com");
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.xpath("//input[@id='identifierId']"));
        username.clear();
        username.sendKeys("ossaiant01@gmail.com");
        System.out.println("Test script executed successfully.");
        driver.quit();

	}

}
