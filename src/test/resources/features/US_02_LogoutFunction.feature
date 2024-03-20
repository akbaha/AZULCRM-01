@B32G19-271
Feature: Default


  @B32G19-269
  Scenario Outline: Verify that the user can log out from the app after clicking the “Log out” button.
    Given the user logged in as "<user type>"
    When user click the username and click logout button
    Then user should log out

    Examples:
      | user type      |
      | Helpdesk user  |
      | Marketing user |
      | HR user        |


  @B32G19-270
  Scenario Outline: Verify that the user can see 5 options under the profile name.
    Given the user logged in as "<user type>"
    When user click the username
    Then user should see following options exist under the profile name
      | My Profile              |
      | Edit Profile Settings   |
      | Themes                  |
      | Configure notifications |
      | Log out                 |

    Examples:
      | user type      |
      | Helpdesk user  |
      | Marketing user |
      | HR user        |