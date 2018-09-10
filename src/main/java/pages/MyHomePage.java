package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods {

	public MyHomePage() {
		PageFactory.initElements(driver, this);
		}
		
		@FindBy(partialLinkText="Leads")
		WebElement eleLeads;
		@And("click leads")
		public MyLeadsPage clickLeads() {	
		
			click(eleLeads);
			return new MyLeadsPage();
	
	
	
	
}}
