$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:FeatureFiles/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify user login with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user open browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_open_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter url \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_enter_url(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user get page with title \"Your store. Login\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_get_page_with_title(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter email as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_enter_email_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login button",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user get the page with \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_get_the_page_with(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on logout button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_click_on_logout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user get page with title \"Your store. Login\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_get_page_with_title(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_close_browser()"
});
formatter.result({
  "status": "passed"
});
});