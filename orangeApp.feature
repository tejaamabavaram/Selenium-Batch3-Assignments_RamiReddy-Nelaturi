Feature: Validate OrangeHRP Page
Scenario: Validating OrangeHRP application Login
Given When I am in OrangeHRP Application 
Then Login to Application 
When Dashboard page is available 
And click on Admin menu
And Close the browser

Scenario: Validating Job Title
Given When I am in OrangeHRP Application
Then Login to Application 
When I click on Admin Link 
Then Click on Job 
And validate text – Job Title
And Close the browser