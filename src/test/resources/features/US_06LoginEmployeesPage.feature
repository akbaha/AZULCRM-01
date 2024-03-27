@US_06
Feature:  Employees Page Navigation
  Scenario Outline: View all modules in the Employees page

    Given the user logged in as "<user type>"
    When the user click on the Employees module

    And the user see all module
      | Company Structure  |
      | Find Employee      |
      | Telephone Directory|
      | Staff Changes      |
      | Efficiency Report  |
      | Honored Employees  |
      | Birthdays          |
      | New page           |



    Examples:
      | user type      |
      | Helpdesk user  |
      | Marketing user |
      | HR user        |


    Scenario Outline: Default view of Company Structure module
    Given the user logged in as "<user type>"
    When the user click on the Employees module
    Then the "Company Structure" module should be displayed

      Examples:
        | user type      |
        | Helpdesk user  |
       | Marketing user |
       | HR user        |


      #comment