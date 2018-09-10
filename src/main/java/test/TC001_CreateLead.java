package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import wdMethods.ProjectMethods;

public class TC001_CreateLead extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName = "TC001_CreateLead";
		testDescription ="Create a lead";
		category = "Smoke";
		authors= "sarumathi";
		testNodes = "Leads";
		dataSheetName="TC001";
	}
	@Test(dataProvider="fetchData")
	public  void createLead( String cname, String fname, String lname)   {

		new HomePage()
		.clickCRM()
		.clickLeads()
		.clickCreateLd()
		.typeCname(cname)
		.typefname(fname)
		.typeLname(lname)
		.clickSubmitButton()
		.verifyFname(fname);
	}


	
	
	
}
