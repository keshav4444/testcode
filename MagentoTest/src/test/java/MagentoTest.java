

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MagentoTest {
	@Test
	public void first() throws Exception {
		String url="https://magento.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
		Main m = new Main(driver);
		m.clickOnMyacc();
		Thread.sleep(3000);
		
		Login login = new Login(driver);
		login.typeEmail("amithydedas@gmail.com");
		login.typePwd("Welcome123");
		login.clickOnLogin();
	
		Logout logout = new Logout(driver);
		logout.clickOnLogout();
		Thread.sleep(2000);	
		
		driver.quit();
	}
}
