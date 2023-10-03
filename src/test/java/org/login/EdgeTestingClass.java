package org.login;

import java.awt.event.KeyEvent;
import java.time.Duration;
import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.pom.LoginPom;
import org.testng.annotations.Test;

public class EdgeTestingClass extends BaseClass {

	public static BaseClass b = new BaseClass();

	public static LoginPom pom;

	@Test(priority=1)
	public static void initBrowser() {

		try {

			b.getDriver("Chrome");
			b.windowsMax();
			System.out.println("Browser launched sucessfully");		
			//Report -Browser launched successfully

			b.getUrl("https://www.trustmemobiles.com/");
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));
			
			b.getAlert("accept");
			System.out.println("URL Launched Sucessfully");
			//Report -URL Launched Successfully
		} catch (Exception e) {
			System.out.println("URL Not Launched Sucessfully");
		}
	}

	@Test(priority=2)
	public void LoginData() {		
		try {
			
			pom =new LoginPom();
			
			b.getThread(3000);
			WebElement searchbox = pom.getsearchbox();
			b.buttonClick(searchbox);
			searchbox.click();
			b.gettextSend(searchbox, "vivo v25 pro");			
			
		    WebElement getsearchbutton = pom.getsearchbutton();
		    getsearchbutton.click();getKey(KeyEvent.VK_ENTER);		
			
			System.out.println("Login Sucessfully");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Login Not Sucessfully");
		}  
	}

	@Test(priority=3)
	public void FindPhone() {
		try {
			
			pom =new LoginPom();
			
			b.getThread(3000);
			 WebElement findphone = pom.getfindphone();
			b.buttonClick(findphone);
			
			b.getThread(3000);
			WebElement addCart1 = pom.getAddCart1();
			b.buttonClick(addCart1);
			
			b.getThread(3000);
			WebElement getfindIphone13 = pom.getfindIphone13();
			b.buttonClick(getfindIphone13);
			
			b.getThread(3000);
			WebElement addCart2 = pom.getAddCart2();
			b.buttonClick(addCart2);
			
			System.out.println("AddtoCart Sucessfully");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(" AddtoCart Not Sucessfully");
		}  
	}


	
}

