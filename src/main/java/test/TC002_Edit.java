package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import wdMethods.ProjectMethods;

public class TC002_Edit extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName = "TC002_Edit";
		testDescription ="edit a lead";
		category = "Smoke";
		authors= "sarumathi";
		testNodes = "Leads";
		dataSheetName="TC002";
	}
	@Test(dataProvider="fetchData")
public  void editLead(String Phnumber, String updateCname) throws InterruptedException  {
		
		new HomePage()
		.clickCRM()
		.clickLeads()
		.clickFindLeads()
		.clickPhone()
		.typePhoneNumber(Phnumber)
		.clickFindButton()
		.clickFirstLead()
		.clickEditLead()
		.EditCname(updateCname)
		.clickUpdate();	
	}


	
	
	
}
