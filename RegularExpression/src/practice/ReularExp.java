package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReularExp {

	@Test
	public void regexp() {
		String str="asdgferterer@gmail.com";
		Assert.assertEquals((str.matches("^[a-z][a-z_0-9]{1,13}(@gmail.com)$")), true);
	}
}
