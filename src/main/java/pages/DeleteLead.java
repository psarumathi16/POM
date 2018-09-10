package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class DeleteLead  extends ProjectMethods{

	public  DeleteLead() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(linkText="Delete")
	WebElement clickDelete;
	public MyLeadsPage clickDelete() {
		click(clickDelete);
		return new MyLeadsPage();
	}
	
	
}
