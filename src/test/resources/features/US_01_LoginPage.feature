@B32G19-268
Feature: Users should be able to login
  User Story:
  As a user, I should be able to login.
  Users: HR user, Marketing user, Helpdesk user


  Background: User is already in the log in page
    Given the user is on the login page

  @B32G19-263
  Scenario Outline: Verify login with different user types
    When the user logged in as "<user type>"
   # Given the user logged in with username as "<username>" and password as "<password>"
    Then user should land on the homepage

    Examples:
      | user type      |
      | Helpdesk user  |
      | Marketing user |
      | HR user        |

  @B32G19-264
  Scenario Outline: Login with invalid credential
    When user login with invalid "<invalidUsername>" and valid "<password>"
    When user login with valid "<username>" and invalid "<invalidPassword>"
    Then user should see Incorrect login or password error message

    Examples:

      | username             | invalidPassword | invalidUsername   | password |
      | helpdesk1@cydeo.com  | 123456          | helpdesk@cydeocom | UserUser |
      | hr1@cydeo.com        | 012345          | mrktng@cydeo.com  | UserUser |
      | marketing1@cydeo.com | lalala          | hrcydeo.com       | UserUser |

#@B32G19-265
  #@loginWithEmptyFields
  #Scenario: Verify that the "Please fill out this field" error message is displayed if the password or username is empty.

  @B32G19-266
  Scenario: Verify that the "Remember me on this computer" link exists and is clickable on the login page.
    Then Remember me on this computer link exists and is clickable

  @B32G19-267
  Scenario: Verify that the password is in bullet signs by default.
    When user enter password in password area
    Then user should see the password in bullet signs





