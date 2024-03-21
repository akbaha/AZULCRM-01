@US_12
Feature: File and Picture Upload as Messages

  Scenario Outline: User uploads files and pictures
    Given the user logged in as "<user type>"
    Then user click on a More tab
    And user click Appreciation tab
    And the user click upload files
    And the user click Upload Files and images "C:\Users\othma\IdeaProjects\AZULCRM\src\test\resources\Image\cat1.jpg"
    And user click insert in text
    And assert the result image
    And the user click send button

    Examples:
      | user type      |
      | Helpdesk user  |
      #| Marketing user |
      #| HR user        |


  Scenario Outline: User uploads files and pictures
    Given the user logged in as "<user type>"
    Then user click on a More tab
    And user click Appreciation tab
    And the user click upload files
    And the user click Upload Files and images "C:\Users\othma\IdeaProjects\AZULCRM\src\test\resources\Image\cat1.jpg"
    And user click insert in text
    And assert the result image
    And the user remove file

    Examples:
      | user type      |
      | Helpdesk user  |
     # | Marketing user |
    # | HR user        |



























