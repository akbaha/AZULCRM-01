Feature: user should be able to access my profile page.


  Scenario Outline: Verify that the user can view the following options on My Profile page.
    Given the user logged in as "<user type>"
    When user click the username
    And user click on My Profile
    Then user should see the following options exist on My Profile page
      | General       |
      | Drive         |
      | Tasks         |
      | Calendar      |
      | Conversations |

    Examples:
      | user type      |
      | Helpdesk user  |
      | Marketing user |
      | HR user        |

  Scenario Outline: Verify that the email under the General tab is the same as the user’s account.
    Given the user logged in as "<user type>"
    When user click the username
    And user click on My Profile
    Then user should see the email under the General tab is the same as the user’s account.
    Examples:
      | user type      |
      | Helpdesk user  |
      | Marketing user |
      | HR user        |