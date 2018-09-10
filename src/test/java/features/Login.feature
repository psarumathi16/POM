Feature: Leaftap Automation
@smoke
Scenario: Login to Leaftap as DemoSalesMangar
Given Launch the browser
And maximize the browser
And set timeout
And Load the URL
And Enter username as DemoSalesManager
And Enter password as crmsfa	
And click on Login button
And click CRMSFA
And click leads
And click create lead
And Enter Cname as Hcl
And Enter fname as Sarumathi
And Enter lname as Santhosh 
And click Create Lead button

@sanity
Scenario: Login to Leaftap as DemoCSR
Given Launch the browser
And maximize the browser
And set timeout
And Load the URL
And Enter username as DemoSalesManager
And Enter password as crmsfa	
And click on Login button
And click CRMSFA
And click leads
And click create lead
And Enter Cname as Hcl
And Enter fname as Sarumathi
And Enter lname as Santhosh 
And click Create Lead button