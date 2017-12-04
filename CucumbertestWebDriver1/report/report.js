$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("stepdefinition/login.feature");
formatter.feature({
  "id": "we-are-going-to-validate-ntl-taxi-home-page.",
  "tags": [
    {
      "name": "@HomePage",
      "line": 1
    }
  ],
  "description": "",
  "name": "we are going to validate NTL taxi Home Page.",
  "keyword": "Feature",
  "line": 2
});
formatter.scenario({
  "id": "we-are-going-to-validate-ntl-taxi-home-page.;validate-home-page-with-valid-data.",
  "description": "",
  "name": "Validate Home Page with valid data.",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "Open Browser as Firefox",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "Enter URL as http://www.ntltaxi.com/",
  "keyword": "Then ",
  "line": 5
});
formatter.step({
  "name": "Enter UserName as JAY",
  "keyword": "Then ",
  "line": 6
});
formatter.step({
  "name": "EnterMobileno as 12345678",
  "keyword": "Then ",
  "line": 7
});
formatter.step({
  "name": "Enter PickupAdd as ADYAR",
  "keyword": "Then ",
  "line": 8
});
formatter.step({
  "name": "Enter DropAdd as VELACHERRY",
  "keyword": "And ",
  "line": 9
});
formatter.step({
  "name": "Select the Vehicle Type as Sedan",
  "keyword": "When ",
  "line": 10
});
formatter.step({
  "name": "Click the BookLater CheckBox",
  "keyword": "Then ",
  "line": 11
});
formatter.step({
  "name": "Don\u0027t Click BookButton",
  "keyword": "But ",
  "line": 12
});
formatter.match({
  "arguments": [
    {
      "val": "Firefox",
      "offset": 16
    }
  ],
  "location": "HomepageTest1.openBrowser(String)"
});
formatter.result({
  "duration": 20488410062,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.ntltaxi.com/",
      "offset": 13
    }
  ],
  "location": "HomepageTest1.enterurl(String)"
});
formatter.result({
  "duration": 1656903647,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "JAY",
      "offset": 18
    }
  ],
  "location": "HomepageTest1.enterUsername(String)"
});
formatter.result({
  "duration": 237890995,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345678",
      "offset": 17
    }
  ],
  "location": "HomepageTest1.enterMobileno(String)"
});
formatter.result({
  "duration": 4013497806,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ADYAR",
      "offset": 19
    }
  ],
  "location": "HomepageTest1.pickupAdd(String)"
});
formatter.result({
  "duration": 127858978,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "VELACHERRY",
      "offset": 17
    }
  ],
  "location": "HomepageTest1.enterDropAdd(String)"
});
formatter.result({
  "duration": 177529773,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sedan",
      "offset": 27
    }
  ],
  "location": "HomepageTest1.selectVehicleType(String)"
});
formatter.result({
  "duration": 327876537,
  "status": "passed"
});
formatter.match({
  "location": "HomepageTest1.clickBookLater()"
});
formatter.result({
  "duration": 140545067,
  "status": "passed"
});
formatter.match({
  "location": "HomepageTest1.dontClickBookbutton()"
});
formatter.result({
  "duration": 31832,
  "status": "passed"
});
});