Feature: Login
Scenario: Verify user login with valid credentials
Given user open browser
When user enter url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
And user get page with title "Your store. Login"
And user enter email as "admin@yourstore.com" and password as "admin"
When user click on login button
Then user get the page with "Dashboard / nopCommerce administration"
And user click on logout button
And user get page with title "Your store. Login"
Then user close browser