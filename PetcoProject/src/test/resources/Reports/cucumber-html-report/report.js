$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/nthanonk/git/Selenium/Training/PetcoProject/src/test/resources/Features/Testcase.feature");
formatter.feature({
  "line": 2,
  "name": "Petco Website",
  "description": "",
  "id": "petco-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@PetCo_Project"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "validate the login functionality",
  "description": "",
  "id": "petco-website;validate-the-login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@tc_01_login"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Launch the browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Petco page is opened",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Go to Account and Click signin button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Login page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "enter the \"\u003cemail\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Click the login",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Take screenshots and quit browser",
  "keyword": "And "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "petco-website;validate-the-login-functionality;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 16,
      "id": "petco-website;validate-the-login-functionality;;1"
    },
    {
      "cells": [
        "fakeemail@gmail.com",
        "admin123"
      ],
      "line": 17,
      "id": "petco-website;validate-the-login-functionality;;2"
    },
    {
      "cells": [
        "nthanonklin@gmail.com",
        "Barkbark99"
      ],
      "line": 18,
      "id": "petco-website;validate-the-login-functionality;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "validate the login functionality",
  "description": "",
  "id": "petco-website;validate-the-login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@tc_01_login"
    },
    {
      "line": 1,
      "name": "@PetCo_Project"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Launch the browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Petco page is opened",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Go to Account and Click signin button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Login page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "enter the \"fakeemail@gmail.com\" and \"admin123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Click the login",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Take screenshots and quit browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.launch_the_browser_and_enter_the_url()"
});
formatter.result({
  "duration": 3738899311,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.petco_page_is_opened()"
});
formatter.result({
  "duration": 21376660,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.go_to_Account_and_click_signin_button()"
});
formatter.result({
  "duration": 1798470179,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.login_page_is_displayed()"
});
formatter.result({
  "duration": 54165242,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "fakeemail@gmail.com",
      "offset": 11
    },
    {
      "val": "admin123",
      "offset": 37
    }
  ],
  "location": "LoginSteps.enter_the_and(String,String)"
});
formatter.result({
  "duration": 325600773,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.click_the_login()"
});
formatter.result({
  "duration": 1039583731,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.take_screenshots_and_quit_browser()"
});
formatter.result({
  "duration": 684785784,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "validate the login functionality",
  "description": "",
  "id": "petco-website;validate-the-login-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@tc_01_login"
    },
    {
      "line": 1,
      "name": "@PetCo_Project"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Launch the browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Petco page is opened",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Go to Account and Click signin button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Login page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "enter the \"nthanonklin@gmail.com\" and \"Barkbark99\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Click the login",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Take screenshots and quit browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.launch_the_browser_and_enter_the_url()"
});
formatter.result({
  "duration": 2398625686,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.petco_page_is_opened()"
});
formatter.result({
  "duration": 25381567,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.go_to_Account_and_click_signin_button()"
});
formatter.result({
  "duration": 1388499380,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.login_page_is_displayed()"
});
formatter.result({
  "duration": 16108390,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nthanonklin@gmail.com",
      "offset": 11
    },
    {
      "val": "Barkbark99",
      "offset": 39
    }
  ],
  "location": "LoginSteps.enter_the_and(String,String)"
});
formatter.result({
  "duration": 964232450,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.click_the_login()"
});
formatter.result({
  "duration": 224115931,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.take_screenshots_and_quit_browser()"
});
formatter.result({
  "duration": 679895399,
  "status": "passed"
});
});