$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("stepdefinition/Home.feature");
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
formatter.scenarioOutline({
  "id": "we-are-going-to-validate-ntl-taxi-home-page.;validate-home-page-with-valid-data.",
  "description": "",
  "name": "Validate Home Page with valid data.",
  "keyword": "Scenario Outline",
  "line": 3,
  "type": "scenario_outline"
});
formatter.step({
  "name": "Open Browser as \u003cBROWSER\u003e",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "Enter URL as \u003cURL\u003e",
  "keyword": "Then ",
  "line": 5
});
formatter.step({
  "name": "Enter UserName as \u003cNAME\u003e",
  "keyword": "Then ",
  "line": 6
});
formatter.step({
  "name": "EnterMobileno as \u003cNUMBER\u003e",
  "keyword": "Then ",
  "line": 7
});
formatter.step({
  "name": "Enter PickupAdd as \u003cPICKUPADD\u003e",
  "keyword": "Then ",
  "line": 8
});
formatter.step({
  "name": "Enter DropAdd as \u003cDROPADD\u003e",
  "keyword": "And ",
  "line": 9
});
formatter.step({
  "name": "Select the Vehicle Type as \u003cVTYPE\u003e",
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
formatter.examples({
  "id": "we-are-going-to-validate-ntl-taxi-home-page.;validate-home-page-with-valid-data.;",
  "description": "",
  "name": "",
  "keyword": "Examples",
  "line": 13,
  "rows": [
    {
      "id": "we-are-going-to-validate-ntl-taxi-home-page.;validate-home-page-with-valid-data.;;1",
      "cells": [
        "BROWSER",
        "URL",
        "NAME",
        "NUMBER",
        "PICKUPADD",
        "DROPADD",
        "VTYPE"
      ],
      "line": 14
    },
    {
      "id": "we-are-going-to-validate-ntl-taxi-home-page.;validate-home-page-with-valid-data.;;2",
      "cells": [
        "firefox",
        "Url1",
        "Name1",
        "Number1",
        "Pickupadd1",
        "Dropadd1",
        "Vtype1"
      ],
      "line": 15
    },
    {
      "id": "we-are-going-to-validate-ntl-taxi-home-page.;validate-home-page-with-valid-data.;;3",
      "cells": [
        "Chrome",
        "Url2",
        "Name2",
        "Number2",
        "Pickupadd2",
        "Dropadd2",
        "Vtype2"
      ],
      "line": 16
    },
    {
      "id": "we-are-going-to-validate-ntl-taxi-home-page.;validate-home-page-with-valid-data.;;4",
      "cells": [
        "ie",
        "Url3",
        "Name3",
        "Number3",
        "Pickupadd3",
        "Dropadd3",
        "Vtype3"
      ],
      "line": 17
    },
    {
      "id": "we-are-going-to-validate-ntl-taxi-home-page.;validate-home-page-with-valid-data.;;5",
      "cells": [
        "safari",
        "Url4",
        "Name4",
        "Number4",
        "Pickupadd4",
        "Dropadd4",
        "Vtype4"
      ],
      "line": 18
    }
  ]
});
formatter.scenario({
  "id": "we-are-going-to-validate-ntl-taxi-home-page.;validate-home-page-with-valid-data.;;2",
  "tags": [
    {
      "name": "@HomePage",
      "line": 1
    }
  ],
  "description": "",
  "name": "Validate Home Page with valid data.",
  "keyword": "Scenario Outline",
  "line": 15,
  "type": "scenario"
});
formatter.step({
  "name": "Open Browser as firefox",
  "keyword": "Given ",
  "line": 4,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "Enter URL as Url1",
  "keyword": "Then ",
  "line": 5,
  "matchedColumns": [
    1
  ]
});
formatter.step({
  "name": "Enter UserName as Name1",
  "keyword": "Then ",
  "line": 6,
  "matchedColumns": [
    2
  ]
});
formatter.step({
  "name": "EnterMobileno as Number1",
  "keyword": "Then ",
  "line": 7,
  "matchedColumns": [
    3
  ]
});
formatter.step({
  "name": "Enter PickupAdd as Pickupadd1",
  "keyword": "Then ",
  "line": 8,
  "matchedColumns": [
    4
  ]
});
formatter.step({
  "name": "Enter DropAdd as Dropadd1",
  "keyword": "And ",
  "line": 9,
  "matchedColumns": [
    5
  ]
});
formatter.step({
  "name": "Select the Vehicle Type as Vtype1",
  "keyword": "When ",
  "line": 10,
  "matchedColumns": [
    6
  ]
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
      "val": "firefox",
      "offset": 16
    }
  ],
  "location": "HomePageTest.openBrowser(String)"
});
formatter.result({
  "duration": 277047449,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Url1",
      "offset": 13
    }
  ],
  "location": "HomePageTest.enterurl(String)"
});
formatter.result({
  "duration": 313695,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name1",
      "offset": 18
    }
  ],
  "location": "HomePageTest.enterUsername(String)"
});
formatter.result({
  "duration": 284944,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Number1",
      "offset": 17
    }
  ],
  "location": "HomePageTest.enterMobileno(String)"
});
formatter.result({
  "duration": 281350,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pickupadd1",
      "offset": 19
    }
  ],
  "location": "HomePageTest.pickupAdd(String)"
});
formatter.result({
  "duration": 283404,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dropadd1",
      "offset": 17
    }
  ],
  "location": "HomePageTest.enterDropAdd(String)"
});
formatter.result({
  "duration": 360415,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Vtype1",
      "offset": 27
    }
  ],
  "location": "HomePageTest.selectVehicleType(String)"
});
formatter.result({
  "duration": 317802,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.clickBookLater()"
});
formatter.result({
  "duration": 93441,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.dontClickBookbutton()"
});
formatter.result({
  "duration": 82659,
  "status": "passed"
});
formatter.scenario({
  "id": "we-are-going-to-validate-ntl-taxi-home-page.;validate-home-page-with-valid-data.;;3",
  "tags": [
    {
      "name": "@HomePage",
      "line": 1
    }
  ],
  "description": "",
  "name": "Validate Home Page with valid data.",
  "keyword": "Scenario Outline",
  "line": 16,
  "type": "scenario"
});
formatter.step({
  "name": "Open Browser as Chrome",
  "keyword": "Given ",
  "line": 4,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "Enter URL as Url2",
  "keyword": "Then ",
  "line": 5,
  "matchedColumns": [
    1
  ]
});
formatter.step({
  "name": "Enter UserName as Name2",
  "keyword": "Then ",
  "line": 6,
  "matchedColumns": [
    2
  ]
});
formatter.step({
  "name": "EnterMobileno as Number2",
  "keyword": "Then ",
  "line": 7,
  "matchedColumns": [
    3
  ]
});
formatter.step({
  "name": "Enter PickupAdd as Pickupadd2",
  "keyword": "Then ",
  "line": 8,
  "matchedColumns": [
    4
  ]
});
formatter.step({
  "name": "Enter DropAdd as Dropadd2",
  "keyword": "And ",
  "line": 9,
  "matchedColumns": [
    5
  ]
});
formatter.step({
  "name": "Select the Vehicle Type as Vtype2",
  "keyword": "When ",
  "line": 10,
  "matchedColumns": [
    6
  ]
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
      "val": "Chrome",
      "offset": 16
    }
  ],
  "location": "HomePageTest.openBrowser(String)"
});
formatter.result({
  "duration": 143242,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Url2",
      "offset": 13
    }
  ],
  "location": "HomePageTest.enterurl(String)"
});
formatter.result({
  "duration": 113464,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name2",
      "offset": 18
    }
  ],
  "location": "HomePageTest.enterUsername(String)"
});
formatter.result({
  "duration": 115004,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Number2",
      "offset": 17
    }
  ],
  "location": "HomePageTest.enterMobileno(String)"
});
formatter.result({
  "duration": 116032,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pickupadd2",
      "offset": 19
    }
  ],
  "location": "HomePageTest.pickupAdd(String)"
});
formatter.result({
  "duration": 136568,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dropadd2",
      "offset": 17
    }
  ],
  "location": "HomePageTest.enterDropAdd(String)"
});
formatter.result({
  "duration": 123219,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Vtype2",
      "offset": 27
    }
  ],
  "location": "HomePageTest.selectVehicleType(String)"
});
formatter.result({
  "duration": 117571,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.clickBookLater()"
});
formatter.result({
  "duration": 64177,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.dontClickBookbutton()"
});
formatter.result({
  "duration": 80092,
  "status": "passed"
});
formatter.scenario({
  "id": "we-are-going-to-validate-ntl-taxi-home-page.;validate-home-page-with-valid-data.;;4",
  "tags": [
    {
      "name": "@HomePage",
      "line": 1
    }
  ],
  "description": "",
  "name": "Validate Home Page with valid data.",
  "keyword": "Scenario Outline",
  "line": 17,
  "type": "scenario"
});
formatter.step({
  "name": "Open Browser as ie",
  "keyword": "Given ",
  "line": 4,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "Enter URL as Url3",
  "keyword": "Then ",
  "line": 5,
  "matchedColumns": [
    1
  ]
});
formatter.step({
  "name": "Enter UserName as Name3",
  "keyword": "Then ",
  "line": 6,
  "matchedColumns": [
    2
  ]
});
formatter.step({
  "name": "EnterMobileno as Number3",
  "keyword": "Then ",
  "line": 7,
  "matchedColumns": [
    3
  ]
});
formatter.step({
  "name": "Enter PickupAdd as Pickupadd3",
  "keyword": "Then ",
  "line": 8,
  "matchedColumns": [
    4
  ]
});
formatter.step({
  "name": "Enter DropAdd as Dropadd3",
  "keyword": "And ",
  "line": 9,
  "matchedColumns": [
    5
  ]
});
formatter.step({
  "name": "Select the Vehicle Type as Vtype3",
  "keyword": "When ",
  "line": 10,
  "matchedColumns": [
    6
  ]
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
      "val": "ie",
      "offset": 16
    }
  ],
  "location": "HomePageTest.openBrowser(String)"
});
formatter.result({
  "duration": 166859,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Url3",
      "offset": 13
    }
  ],
  "location": "HomePageTest.enterurl(String)"
});
formatter.result({
  "duration": 134514,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name3",
      "offset": 18
    }
  ],
  "location": "HomePageTest.enterUsername(String)"
});
formatter.result({
  "duration": 128353,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Number3",
      "offset": 17
    }
  ],
  "location": "HomePageTest.enterMobileno(String)"
});
formatter.result({
  "duration": 116544,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pickupadd3",
      "offset": 19
    }
  ],
  "location": "HomePageTest.pickupAdd(String)"
});
formatter.result({
  "duration": 185855,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dropadd3",
      "offset": 17
    }
  ],
  "location": "HomePageTest.enterDropAdd(String)"
});
formatter.result({
  "duration": 143242,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Vtype3",
      "offset": 27
    }
  ],
  "location": "HomePageTest.selectVehicleType(String)"
});
formatter.result({
  "duration": 126813,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.clickBookLater()"
});
formatter.result({
  "duration": 67257,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.dontClickBookbutton()"
});
formatter.result({
  "duration": 63149,
  "status": "passed"
});
formatter.scenario({
  "id": "we-are-going-to-validate-ntl-taxi-home-page.;validate-home-page-with-valid-data.;;5",
  "tags": [
    {
      "name": "@HomePage",
      "line": 1
    }
  ],
  "description": "",
  "name": "Validate Home Page with valid data.",
  "keyword": "Scenario Outline",
  "line": 18,
  "type": "scenario"
});
formatter.step({
  "name": "Open Browser as safari",
  "keyword": "Given ",
  "line": 4,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "Enter URL as Url4",
  "keyword": "Then ",
  "line": 5,
  "matchedColumns": [
    1
  ]
});
formatter.step({
  "name": "Enter UserName as Name4",
  "keyword": "Then ",
  "line": 6,
  "matchedColumns": [
    2
  ]
});
formatter.step({
  "name": "EnterMobileno as Number4",
  "keyword": "Then ",
  "line": 7,
  "matchedColumns": [
    3
  ]
});
formatter.step({
  "name": "Enter PickupAdd as Pickupadd4",
  "keyword": "Then ",
  "line": 8,
  "matchedColumns": [
    4
  ]
});
formatter.step({
  "name": "Enter DropAdd as Dropadd4",
  "keyword": "And ",
  "line": 9,
  "matchedColumns": [
    5
  ]
});
formatter.step({
  "name": "Select the Vehicle Type as Vtype4",
  "keyword": "When ",
  "line": 10,
  "matchedColumns": [
    6
  ]
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
      "val": "safari",
      "offset": 16
    }
  ],
  "location": "HomePageTest.openBrowser(String)"
});
formatter.result({
  "duration": 156591,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Url4",
      "offset": 13
    }
  ],
  "location": "HomePageTest.enterurl(String)"
});
formatter.result({
  "duration": 433833,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name4",
      "offset": 18
    }
  ],
  "location": "HomePageTest.enterUsername(String)"
});
formatter.result({
  "duration": 184828,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Number4",
      "offset": 17
    }
  ],
  "location": "HomePageTest.enterMobileno(String)"
});
formatter.result({
  "duration": 208959,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pickupadd4",
      "offset": 19
    }
  ],
  "location": "HomePageTest.pickupAdd(String)"
});
formatter.result({
  "duration": 184828,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dropadd4",
      "offset": 17
    }
  ],
  "location": "HomePageTest.enterDropAdd(String)"
});
formatter.result({
  "duration": 215633,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Vtype4",
      "offset": 27
    }
  ],
  "location": "HomePageTest.selectVehicleType(String)"
});
formatter.result({
  "duration": 125786,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.clickBookLater()"
});
formatter.result({
  "duration": 67771,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.dontClickBookbutton()"
});
formatter.result({
  "duration": 90360,
  "status": "passed"
});
});