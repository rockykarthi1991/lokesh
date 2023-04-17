package pack1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//file=> new= > project=> maven=> maven project=> create a simple=> group id, artifact id=> finish
// right click=> project=> new => package
// right click=> package=> new => class=> test case
// added selenium code 
// pom.xml=> <dependencies></dependencies?
// mvnrepositoru.com
// selenium hq server standalone
// selenium java
// 3.141.59
// copy , paste in dependencies tag
// save=> maven dependencies 

public class c1 {
	
	@Test(groups="One")
	public void t1()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Documents\\chromedriver.exe");
		
		 ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.google.com");
		System.out.println(ob.getTitle());
		ob.quit();
	}

}
