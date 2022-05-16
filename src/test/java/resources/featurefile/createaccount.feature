
  Feature: CreateAccountPage Test

    Scenario: verify that user should create account successfully
      Given I am on homepage
      When  I click on Signin tab
      And   I enter the email "s1_adep_patil81468@gmail.com" in the email field create account page
      And   I click on create an account button
      And   I click on Radio button
      And   I entered firstname "simon" in the name field
      And   I entered lastname "Patel" in the last name field
      And   I entered password "123456@" in the password field
      And   I entered day of birth "10" in the field
      And   I entered month of birth "10" in the month field
      And   I entered year of birth "2001" in the year field
      And   I click on newsletter button
      And   I clcik on receive special offer
      And   I entered name to deliver "sam" in the name field
      And   I entered last name to deliver "Patel" in the last name field
      And   I entered address "Old street" in the address field
      And   I entered addressline "East field" in the addressline field
      And   I entered city "Euston" in the city field
      And   I entered state "Texas" in the state field
      And   I entered zipcode "22556" in the zipcode field
      And   I entered country name "United States" in the field
      And   I entered additional infomation "deliver next door" in the field
      And   I entered home telephone number "011566677788" in the field
      And   I entered Mobile number "0754488995566" in the field
      And   I entered Assign an address "xyz street" in the field
      And   I click on Register button
      Then  I can see account "MY ACCOUNT" field

