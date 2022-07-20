@Login
Feature: Verifying Adactin Login Hotel details

  Background: 
    Given User is on the Adactin Page

  Scenario Outline: Verifying Adactin hotel login with valid credentials
    When User should perform login "<username>","<password>"
    And User should verify after login "Hello rithvikansu!"

    Examples: 
      | username    | password |
      | rithvikansu | Kutt@123 |

  Scenario Outline: Verifying Adactin hotel login with valid credentials using Enter Key
    When User should perform login "<username>","<password>" using enter key
    And User should verify after login "Hello rithvikansu!"

    Examples: 
      | username    | password |
      | rithvikansu | Kutt@123 |

  Scenario Outline: Verifying Adactin login page with invalid credentials
    When User should perform login "<username>","<password>"
    And User should verify after login error message which contains "Invalid Login details or Your Password might have expired."

    Examples: 
      | username    | password   |
      | rithvikansu | Kutt@12345 |
