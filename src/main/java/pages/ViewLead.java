package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLead  extends ProjectMethods{
	
	
	public ViewLead() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="viewLead_firstName_sp")
	WebElement eleVerify;
	public void verifyFname(String data) {
		verifyExactText(eleVerify, data);
	}
	
	
	@FindBy(linkText="Edit")
	WebElement eleEditLead;
	public EditLead clickEditLead() {
		click(eleEditLead);
		return new EditLead();
		
	}
	
	
	@FindBy(linkText="Delete")
	WebElement clickDelete;
	public MyLeadsPage clickDelete() {
		click(clickDelete);
		return new MyLeadsPage();
	}
	

}
