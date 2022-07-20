@SelectHotel
Feature: Verifying Adactin Select Hotel details

  Background: 
    Given User is on the Adactin Page

  Scenario Outline: Verifying Adactin select hotel page by selecting a hotel
    When User should perform login "<username>","<password>"
    And User should verify after login "Hello rithvikansu!"
    And User should search hotels "<location>", "<Hotels>", "<Room_Type>", "<room_nos>", "<datepick_in>", "<datepick_out>", "<adult_room>" and "<child_room>"
    Then User should verify whether it is navigating to Select hotel page "Select Hotel"
    And User should select a hotel
    Then User should verify after selecting a hotel confirmation message in book hotel page as "Book A Hotel"

    Examples: 
      | username    | password | location  | Hotels        | Room_Type | room_nos | datepick_in | datepick_out | adult_room | child_room |
      | rithvikansu | Kutt@123 | Melbourne | Hotel Cornice | Standard  | 4 - Four | 04/07/2022  | 14/07/2022   | 2 - Two    | 2 - Two    |

  Scenario Outline: Verifying Adactin select hotel page by not selecting any hotel
    When User should perform login "<username>","<password>"
    And User should verify after login "Hello rithvikansu!"
    And User should search hotels "<location>", "<Hotels>", "<Room_Type>", "<room_nos>", "<datepick_in>", "<datepick_out>", "<adult_room>" and "<child_room>"
    Then User should verify whether it is navigating to Select hotel page "Select Hotel"
    And User should click continue without selecting any hotel
    Then User should verify the select hotel page error message without selecting any hotel "Please Select a Hotel"

    Examples: 
      | username    | password | location  | Hotels        | Room_Type | room_nos | datepick_in | datepick_out | adult_room | child_room |
      | rithvikansu | Kutt@123 | Melbourne | Hotel Cornice | Standard  | 4 - Four | 14/07/2022  | 24/07/2022   | 2 - Two    | 2 - Two    |
