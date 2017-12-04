@HomePage
Feature: we are going to validate NTL taxi Home Page.
Scenario Outline: Validate Home Page with valid data.
Given Open Browser as <BROWSER>
Then Enter URL as <URL>
Then Enter UserName as <NAME>
Then EnterMobileno as <NUMBER>
Then Enter PickupAdd as <PICKUPADD>
And Enter DropAdd as <DROPADD>
When Select the Vehicle Type as <VTYPE>
Then Click the BookLater CheckBox
But Don't Click BookButton
Examples:
|BROWSER|URL|NAME|NUMBER|PICKUPADD|DROPADD|VTYPE|
|firefox|Url1|Name1|Number1|Pickupadd1|Dropadd1|Vtype1|
|Chrome|Url2|Name2|Number2|Pickupadd2|Dropadd2|Vtype2|
|ie|Url3|Name3|Number3|Pickupadd3|Dropadd3|Vtype3|
|safari|Url4|Name4|Number4|Pickupadd4|Dropadd4|Vtype4|
