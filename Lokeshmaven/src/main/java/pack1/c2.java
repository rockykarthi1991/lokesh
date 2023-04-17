package pack1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class c2 {
	
	@Test(groups="One")
	public void t2() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://jqueryui.com/droppable/");
		//webelements=> frame
		// switch ur control to that frame
		// index, id, name
		ob.switchTo().frame(0);
		Actions ac= new Actions(ob);
		WebElement ele1 = ob.findElementById("draggable");
		WebElement ele2 = ob.findElementById("droppable");
		ac.dragAndDrop(ele1, ele2).build().perform();
		File f = ob.getScreenshotAs(OutputType.FILE);
		//FileUtils => static=> Apache directory studio common io
		FileUtils.copyFile(f, new File("C:\\Users\\hp\\eclipse-workspace\\Lokeshmaven\\screenshots\\l.png"));
		Thread.sleep(3000);
		ob.close();
	}

}
