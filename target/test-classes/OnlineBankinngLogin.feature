@SmokeTest
@Regression
Feature: Online Banking application login function
@LP-18
@Positive
Scenario: Check login with valid credential
Given go to application URL

When put valid user name
And put valid password
And click sign in
Then check sign out button
   
@LP-19
 @Negative 
 Scenario: Check Login function with invalid creadential 
  Given Go to application URl
  When Put invalid user name
  And put invalid password
  And Click the login 
  Then Logout button should not be visible 
   