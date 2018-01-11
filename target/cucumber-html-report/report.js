$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("scenarios.feature");
formatter.feature({
  "line": 1,
  "name": "Title of your feature",
  "description": "",
  "id": "title-of-your-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Title of your scenario",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I launch the ultimatix application",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I enter the username",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I enter the password",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I click on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Homepage should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.i_launch_the_ultimatix_application()"
});
formatter.result({
  "duration": 9511553974,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_enter_the_username()"
});
formatter.result({
  "duration": 136881474,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_enter_the_password()"
});
formatter.result({
  "duration": 110615755,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_click_on_the_login_button()"
});
formatter.result({
  "duration": 22170356955,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.homepage_should_be_displayed()"
});
formatter.result({
  "duration": 2262946971,
  "status": "passed"
});
});