Feature: this is functionality for automation practice

Scenario: This is login functionality
Given user enter url of automation website
When user click sign in buttton
And user enter as email id "ansari110@gmail.com"
And user click creat account button

Scenario: this is personal information functionality
	When user click ratio button
	And user send firstname as "ansari" and lastname as "m"
	And user set the password as "Ansari123"
	And user set the dat of birth
	And user click Sign up for our newsletter!
	And user click Receive special offers from our partners
	And user enter first name "ansari" and lastname as "m"
	And user enter company name as "xyz company"
	And user enter address as "sjfhj"
	And user enter addrss line1 "dfkjaskd"
	And user enter city as "chennai"
	And user choose state 
	And user enter posta code as "00000"
	And user choose country
	And user enter additiona information as "sdfjsdjkflk"
	And enter mobile number as "9123349494"
	And user enter assign an address alias  as "adayar"
	And user click register button
	Then user should be register succesfully
	
Scenario: This is choose dress functionality
	When user go to women section
	And user choose t shirt
	And user click add to card
	And user click proceed to checkout
	And user click proceed to sinin
	And user click proceed to Address
	And user click proceed to shipping and agree terms and conditions
	And user click proceed to payment
	And user confirm the order 
	Then user should be order
	
	
Scenario: user verify the order history
	