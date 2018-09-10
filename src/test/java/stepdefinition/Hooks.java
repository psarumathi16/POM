package stepdefinition;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.ProjectMethods;

public class Hooks extends ProjectMethods{

	@Before
	public void beforemethod(Scenario sc) {
		String name = sc.getName();
		System.out.println(name);
		String id = sc.getId();
		System.out.println(id);
		System.out.println();
		
		startResult();
		startTestModule(sc.getName(),sc.getId());	
		test = startTestCase(sc.getName());
		test.assignCategory("smoke");
		test.assignAuthor("sarumathi");
		startApp("chrome", "http://leaftaps.com/opentaps");
		
	}
	
	
	@After
	public void aftermethod() {
		closeAllBrowsers();
		endResult();
		
	}
}
