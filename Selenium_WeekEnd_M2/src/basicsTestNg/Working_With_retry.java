package basicsTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Working_With_retry extends ConfigClasses{

	@Test(retryAnalyzer = RetryEx.class)
	public void retry() throws InterruptedException {
		Thread.sleep(3000);
		Assert.fail();
		
	}

}
