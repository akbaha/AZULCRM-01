@wip
Feature: User should be able to send appreciation by clicking on Appreciation tab in the Activity Stream

  Scenario Outline: Verify that the user can send an appreciation by filling in the mandatory fields.
    Given the user logged in as "<user type>"
    Then user should land on the homepage
    Then user click on a More tab
    And user click Appreciation tab
    Then user can write "New Appreciation" in the Message title field
    Then user should see in the delivery box "All employees" by default
    Then user click on Send button
    Then user can see created post with Message title "New Appreciation"
    Examples:
      | user type      |
      | Helpdesk user  |
      | Marketing user |
      | HR user        |

  Scenario Outline: Verify the corresponding error messages for the mandatory fields. Message content.
    Given the user logged in as "<user type>"
    Then user should land on the homepage
    Then user click on a More tab
    And user click Appreciation tab
    Then user should see in the delivery box "All employees" by default
    Then user click on Send button
    Then user can see Error message "The message title is not specified"
    Examples:
      | user type      |
      | Helpdesk user  |
      | Marketing user |
      | HR user        |

  Scenario Outline: Verify the corresponding error messages for the mandatory fields. Recipient.
    Given the user logged in as "<user type>"
    Then user should land on the homepage
    Then user click on a More tab
    And user click Appreciation tab
    Then user can write "Message title" in the Message title field
    Then user delete all employees from delivery box
    Then user click on Send button
    Then user can see Error message "Please specify at least one person"
    Examples:
      | user type      |
      | Helpdesk user  |
      | Marketing user |
      | HR user        |

  Scenario Outline: Verify that the delivery is 'All employees' by default.
    Given the user logged in as "<user type>"
    Then user should land on the homepage
    Then user click on a More tab
    And user click Appreciation tab
    Then user should see in the delivery box "All employees" by default
    Examples:
      | user type      |
      | Helpdesk user  |
      | Marketing user |
      | HR user        |

  Scenario Outline: Verify that the user can cancel sending appreciation at any time before sending.
    Given the user logged in as "<user type>"
    Then user should land on the homepage
    Then user click on a More tab
    And user click Appreciation tab
    Then user can write "Appreciation is canceled" in the Message title field
    Then user should see in the delivery box "All employees" by default
    Then user click on Cancel button
    Then user can not see created post with Message title "Appreciation is canceled"
    Examples:
      | user type      |
      | Helpdesk user  |
      | Marketing user |
      | HR user        |
