
#Sample Feature Definition Template
@tag
Feature: Title of your feature
	I want to use this template for my feature file


@myTestCases
Scenario: TC01 Display Users Name
* users name and age

@myTC2
Scenario: TC02 Verify the text at TestControl page
* open the browser
* navigate to home page "https://the-internet.herokuapp.com/"
* verify that "home" page is displayed
* click on "A/B Testing" link available
* verify that "A/B Control" page is displayed
* verify that label text is "A/B Test Control"
* close application
