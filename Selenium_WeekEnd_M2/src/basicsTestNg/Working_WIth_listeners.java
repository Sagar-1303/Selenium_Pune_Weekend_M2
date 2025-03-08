package basicsTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenersEx.class)
public class Working_WIth_listeners extends ConfigClasses{

	
	@Test
	public void listeners() throws InterruptedException {

		driver.findElement(By.name("qaacas")).sendKeys("redmi"+Keys.ENTER);
		
	}

}
