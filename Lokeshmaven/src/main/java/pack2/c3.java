package pack2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c3 {
	
	@Test(groups="Two")
	public void t3() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		//visit
		ob.get("http://www.mycontactform.com");
		//id=user
		ob.findElementById("user").sendKeys("Dhivyakarthi123");
		
		//name=pass
		ob.findElementByName("pass").sendKeys("12345");
		
		//class=btn_log
		ob.findElementByClassName("btn_log").click();
		Thread.sleep(3000);
		ob.quit();
	}

}
