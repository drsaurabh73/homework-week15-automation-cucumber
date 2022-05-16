
Feature: SignPage Test

  Scenario: User should navigate to signIn page successFully
    Given   I am on homepage
    When  I click on Signin tab
    Then  I can see the the message "AUTHENTICATION" signin successful

  Scenario: verify that user should logIn successFully with valid credentials
    Given I am on homepage
    When  I click on Signin tab
    And   I enter the email "sampatil@gmail.com" in the email field
    And   I enter the password "123456" in the password field
    And   I click on signin buttton
    Then  I can see the sigout link dispayed on the screen

  Scenario Outline: verify the ErrorMessage with InValid Credentials
    Given I am on homepage
    When  I click on Signin tab
    And   I enter invalid username  "<username>" in the  field
    And   I enter invalid password  "<password>" in the password field
    And   I click on signin buttton
    Then  I can see the error message "<message>" in the field

    Examples:
      | username       | password | message                    |
      |                | 123456   | An email address required. |
      | abcd@gmail.com |          | Password is required.      |
      | adfdfgfg       | 123456   | Invalid email address.     |
      | abcd@gmail.com | 123456   | Authentication failed.     |

    Scenario: verify that user should logOut successFully
      Given I am on homepage
      When  I click on Signin tab
      And   I enter the email "sampatil@gmail.com" in the email field
      And   I enter the password "123456" in the password field
      And   I click on signin buttton
      And   I click on signout button
      Then  I can see sign in link is dispayed on screen





