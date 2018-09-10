package wdMethods;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.DataInputProvider;



public class ProjectMethods extends SeMethods {
	public String browserName;
	public String dataSheetName;
    public static String  text;
	@BeforeSuite
	public void beforeSuite(){
		startResult();
	}

	@BeforeClass
	public void beforeClass(){		
		startTestModule(testCaseName, testDescription);	
	}
    @Parameters({"url"})
	@BeforeMethod
	public void beforeMethod(String url){
		test = startTestCase(testNodes);
		test.assignCategory(category);
		test.assignAuthor(authors);
		startApp("chrome", url);
//		type(locateElement("id", "username"), uname);
//		type(locateElement("id", "password"), pwd);
//		click(locateElement("class", "decorativeSubmit"));
	}

	@AfterSuite
	public void afterSuite(){
		endResult();
	}

	@AfterMethod
	public void afterMethod(){
		//closeAllBrowsers();
	}

	@DataProvider(name="fetchData")
	public  Object[][] getData(){
		return DataInputProvider.getSheet(dataSheetName);		
	}	


}


