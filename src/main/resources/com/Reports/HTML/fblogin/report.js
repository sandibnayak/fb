$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/FbLogIn.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User should in Login Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "FBLogin.user_should_in_Login_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have pass the user ID \u003cuser_id\u003e and password\u003cpass\u003e",
  "rows": [
    {
      "cells": [
        "user_id1",
        "pass1"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "FBLogin.user_have_pass_the_user_ID_user_id_and_password_pass(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User need to click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FBLogin.user_need_to_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Need to check user in fb Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "FBLogin.need_to_check_user_in_fb_Home_Page()"
});
formatter.result({
  "status": "passed"
});
});