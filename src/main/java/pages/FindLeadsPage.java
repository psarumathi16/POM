package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods {

	public FindLeadsPage() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(name="id")
	WebElement eleleadid;
	public FindLeadsPage typeLeadId() {	
	type(eleleadid,text);
		return this;	
	}
	@FindBy(xpath="//span[text()='Phone']")
	WebElement elePhone;
	public FindLeadsPage clickPhone() {	
	click(elePhone);
		return this;	
	}
	@FindBy(name="phoneNumber")
	WebElement elePhoneNumber;
	public FindLeadsPage typePhoneNumber(String data) {	
	type(elePhoneNumber, data);
		return this;	
	}
	
	@FindBy(xpath="//button[text()='Find Leads']")
	WebElement eleFindButton;
	public FindLeadsPage clickFindButton() throws InterruptedException {	
	click(eleFindButton);
	Thread.sleep(2000);
		return this;	
	}
	@FindBy(className="x-paging-info")
	WebElement eleVerify;
	public FindLeadsPage verifyErrormsg(String data) {	
	verifyPartialText(eleVerify, data);
		return this;	
	}
	@FindBy(xpath="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement eleFirstLeadtext;
	public FindLeadsPage gettextofirstLead() {	
		text = eleFirstLeadtext.getText();
		System.out.println(text);
		return this;	
	}
	@FindBy(xpath="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement eleFirstLead;
	public ViewLead clickFirstLead() {	
	click(eleFirstLead);
		return new ViewLead();	
	}
	
	@FindBy(xpath="//span[text()='Email']")
	WebElement eleEmail;
	public FindLeadsPage clickEmail() {	
	click(eleEmail);
		return this;	
	}
	
	@FindBy(name="emailAddress")
	WebElement eleEmailAddress;
	public FindLeadsPage typeEmailAddress(String data) {	
	type(eleEmailAddress,data);
		return this;	
	}
	
	
	
	
}







