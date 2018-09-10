Feature: Leaftap Automation

Background: 
Given Launch the browser
  And Maximize the browser
  And set timeout
  And Load the URL
  @sanity
Scenario Outline:Login into leaftaps for DemoSalesManager
And Enter Uname as <username>
And Enter Password as <password>
When Click login button
Then verify that login is successful
Examples:
   |username|password|
   |DemoSalesManager|crmsfa|
   |DemoCSR|crmsfa|       