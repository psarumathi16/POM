package stepdefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class Login {

	public ChromeDriver driver;
	@Given("Launch the browser")
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
		driver=new ChromeDriver();
	}
	@And("maximize the browser")
	public void maximize() {
		driver.manage().window().maximize();
	}
	@And("set timeout")
	public void settimeout() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@And("Load the URL")
	public void launchurl() {
		driver.get("http://leaftaps.com/opentaps/");

	}
	@And("Enter username as DemoSalesManager")
	public void username() {
		driver.findElementById("username").sendKeys("DemoSalesManager");

	}
	@And("Enter password as crmsfa")
	public void password() {
		driver.findElementById("password").sendKeys("crmsfa");
	}
	@And("click on Login button")
	public void clicklogin() {
		driver.findElementByClassName("decorativeSubmit").click();

	}
	@And("click CRMSFA")
	public void clickCRMSFA() {
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@And("click leads")
	public void clickLeads() {
		driver.findElementByLinkText("Leads").click();
	}
	@And("click create lead")
	public void clickCreatelead() {
		driver.findElementByLinkText("Create Lead").click();
	}
	@And("Enter Cname as Hcl")
	public void enterCname() {
		driver.findElementById("createLeadForm_companyName").sendKeys("Hcl");
	}
	
@And("Enter fname as Sarumathi")
	public void enterFname() {
	driver.findElementById("createLeadForm_firstName").sendKeys("Sarumathi");;
	}
@And("Enter lname as Santhosh")
     public void enterLname() {
	 driver.findElementById("createLeadForm_lastName").sendKeys("Santhosh ");
}

@And("click Create Lead button")
public void clickCreateLead() {
	driver.findElementByName("submitButton").click();

}





}