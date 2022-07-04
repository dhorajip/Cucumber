Feature: Test login functionality


Scenario: Check login is successful with valid credentials

Given user is already on login page
When user enter username and password
And user clicks on login button
Then user should see home page