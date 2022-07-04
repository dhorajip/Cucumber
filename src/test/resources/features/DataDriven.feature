Feature: Test login functionality

@DataDrivenTest
Scenario Outline: Check login is successful with valid credentials

Given user is on login page
And <username> and <password> are entered by user
When user clicks on login button
Then user navigate to home page

Examples:
| username | password |
| Nikunj | testing |
| Amit | test123 |