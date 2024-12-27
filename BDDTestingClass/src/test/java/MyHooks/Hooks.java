package MyHooks;

import com.crm.base.TestBase;

import io.cucumber.java.Before;

public class Hooks extends TestBase{
	@Before
	public void browserInitialization() {
		init();
		LaunchApp();
	}

}
