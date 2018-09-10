package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods {

	
	public CreateLeadPage() {
		PageFactory.initElements(driver, this);
		}
		
	
		@FindBy(id="createLeadForm_companyName")
		WebElement eleCompName;
		@And("Enter Cname as (.*)")
		public CreateLeadPage typeCname(String data) {	
		
			type(eleCompName,data);
			return this;
}
		@FindBy(id="createLeadForm_firstName")
		WebElement eleFirstName;
		@And("Enter fname as (.*)")
		public CreateLeadPage typefname(String data) {	
			
			type(eleFirstName,data);
			return this;
}
		@FindBy(id="createLeadForm_lastName")
		WebElement eleLastName;
		@And("Enter lname as (.*)")
		public CreateLeadPage typeLname(String data) {	
			
			type(eleLastName,data);
			return this;
}
		
		@FindBy(name="submitButton")
		WebElement eleclickCreateLd;
		@And("click Create Lead button")
		public ViewLead clickSubmitButton() {	
			
			click(eleclickCreateLd);
			return new ViewLead();
					
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}