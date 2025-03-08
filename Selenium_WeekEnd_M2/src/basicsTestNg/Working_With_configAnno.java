package basicsTestNg;

import org.testng.annotations.Test;

public class Working_With_configAnno extends ConfigClasses{

	@Test
	public void delete() {
		System.out.println("Delete");
	}
	
	@Test
	public void logOut() {
		System.out.println("LogOut");
	}

}
