package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods {

	public HomePage() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="CRM/SFA")
	WebElement eleCRM;
	@And("click CRMSFA")
	public MyHomePage clickCRM() {	
	
		click(eleCRM);
		return new MyHomePage();
		
	}
	/*@FindBy(className="decorativeSubmit")
	WebElement eleLogOut;
	public LoginPage clickLogOut() {
	//WebElement eleLogin = locateElement("class", "decorativeSubmit");
	click(eleLogOut);
	return new LoginPage();
	}*/
	
	
}







