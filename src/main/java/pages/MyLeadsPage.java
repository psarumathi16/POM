package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{

	public MyLeadsPage() {
		PageFactory.initElements(driver, this);
		}
		
		@FindBy(linkText="Create Lead")
		WebElement eleCreateLd;
		@And("click create lead")
		public CreateLeadPage clickCreateLd() {	
		
			click(eleCreateLd);
			return new CreateLeadPage();
		}
		
		@FindBy(linkText="Find Leads")
		WebElement eleFindLeads;
		public FindLeadsPage clickFindLeads() {	
		
			click(eleFindLeads);
			return new FindLeadsPage();
		}
	
}
