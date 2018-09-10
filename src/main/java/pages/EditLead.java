package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods {
	
	
	public  EditLead() {
		PageFactory.initElements(driver, this);
		}
	@FindBy(id="updateLeadForm_companyName")
	WebElement eleEditCname;
	public EditLead EditCname(String data) {
		
		type(eleEditCname,data);
		return this ;
		
	}	
	
	@FindBy(name="submitButton")
	WebElement eleUpdate;
	public ViewLead clickUpdate() {
		
		click(eleUpdate);
		return new ViewLead() ;
		
	}	
	

}
