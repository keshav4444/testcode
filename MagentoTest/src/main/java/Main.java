

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main {

	WebDriver driver;
	By myacc = By.linkText("My Account");

	public Main(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnMyacc() {
		driver.findElement(myacc).click();
	}
}
