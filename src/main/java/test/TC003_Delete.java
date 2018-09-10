package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_Delete extends ProjectMethods{
	
	
	
	@BeforeTest(groups="common")
	public void setData() {
		testCaseName = "TC003_Delete";
		testDescription ="Delete a lead";
		category = "Smoke";
		authors= "Babu";
		testNodes = "Leads";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	public  void deleteLead(String username,String	pass,String email,String data) throws InterruptedException {
		
		new LoginPage()
		.typeUsername(username)
		.typePassword(pass)
		.clickLogin()
		.clickCRM()
		.clickLeads()
		.clickFindLeads()
		.clickEmail()
		.typeEmailAddress(email)
		.clickFindButton()
		.gettextofirstLead()
		.clickFirstLead()
		.clickDelete()
		.clickFindLeads()
	    .typeLeadId()
	    .clickFindButton()
	    .verifyErrormsg(data);
		
		
		
	}

}
