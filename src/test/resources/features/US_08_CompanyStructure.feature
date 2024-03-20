@tc8
Feature: User should be able to open the the Company Structure


  Scenario Outline: Verify that Company Structure is visible for all Users
    When the user logged in as "<user type>"
   # Given the user logged in with username as "<username>" and password as "<password>"
    Then the user can pass on Company Structure under Employee menu
    Then the Company Structure visible for every user

    Examples:
      | user type      |
      | Helpdesk user  |
      | Marketing user |
      | HR user        |


  Scenario Outline: Verify that HR user can add department
    Given the user logged in as "<user type>"
    Then the user can pass on Company Structure under Employee menu
    When the hr user is on company structure page
    And the hr can add a department


    Examples:
      | user type |
    #| Helpdesk user  |
    #| Marketing user |
      | HR user   |




  Scenario Outline: Verify that helpdesk and marketing users cannot add department
    Given the user logged in as "<user type>"
    Then the user can pass on Company Structure under Employee menu
    When the helpdesk and Marketing users is on company structure page
    And the helpdesk and Marketing users unaccused for adding department


    Examples:
      | user type |
    | Helpdesk user  |
    | Marketing user |
    #  | HR user   |
