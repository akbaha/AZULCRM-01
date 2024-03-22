@testotman
Feature: File and Picture Upload as Messages

  Scenario Outline: User uploads files and pictures
    Given the user logged in as "<user type>"
    When the User clicks link Message
    And the user click upload files
    And the user click Upload Files and images "C:\Users\othma\IdeaProjects\AZULCRM\src\test\resources\Image\InterviewHighlighted.pdf"
    And user click insert in text
    And assert the result
    And the user click send button

    Examples:
      | user type      |
      | Helpdesk user  |
      #| Marketing user |
      #| HR user        |

   # When the user uploads a file with supported format (.pdf, .txt, .jpeg, .png, .docx)
   # Then the file should be successfully uploaded as a message

  @msg
  Scenario Outline: User uploads files and pictures
    Given the user logged in as "<user type>"
    When the User clicks link Message
    And the user click upload files
    And the user click Upload Files and images "C:\Users\othma\IdeaProjects\AZULCRM\src\test\resources\Image\InterviewHighlighted.pdf"
    And user click insert in text
    And assert the result
    And the user remove file

    Examples:
      | user type      |
      | Helpdesk user  |
     # | Marketing user |
    # | HR user        |