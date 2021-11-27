Feature: Test login functionality of facebook

Scenario: Test login functionality with username with valid password

Given as a user we launch a particular url "https://opensource-demo.orangehrmlive.com/"
When as a user we send the username "Admin" and password "admin123"
And as a user we click the login button
Then as a user verifying the given title and url
