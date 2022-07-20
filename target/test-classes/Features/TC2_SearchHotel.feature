@SearchHotel
Feature: Verifying Adactin Search hotel details

  Background: 
    Given User is on the Adactin Page

  Scenario Outline: Verifying Adactin search hotel page by selecting all fields
    When User should perform login "<username>","<password>"
    And User should verify after login "Hello rithvikansu!"
    And User should search hotels "<location>", "<Hotels>", "<Room_Type>", "<room_nos>", "<datepick_in>", "<datepick_out>", "<adult_room>" and "<child_room>"
    Then User should verify whether it is navigating to Select hotel page "Select Hotel"

    Examples: 
      | username    | password | location  | Hotels        | Room_Type | room_nos | datepick_in | datepick_out | adult_room | child_room |
      | rithvikansu | Kutt@123 | Melbourne | Hotel Cornice | Standard  | 4 - Four | 10/07/2022  | 14/07/2022   | 2 - Two    | 2 - Two    |

  Scenario Outline: Verifying Adactin search hotel page by only entering mandatory fields
    When User should perform login "<username>","<password>"
    And User should verify after login "Hello rithvikansu!"
    And User should enter only the mandatory fields "<location>", "<room_nos>", "<datepick_in>", "<datepick_out>" and "<adult_room>"
    Then User should verify whether it is navigating to Select hotel page "Select Hotel"

    Examples: 
      | username    | password | location  | room_nos | datepick_in | datepick_out | adult_room |
      | rithvikansu | Kutt@123 | Melbourne | 4 - Four | 14/07/2022  | 24/07/2022   | 2 - Two    |

  Scenario Outline: Verifying Adactin search hotel page by selecting invalid date
    When User should perform login "<username>","<password>"
    And User should verify after login "Hello rithvikansu!"
    And User should search hotels "<location>", "<Hotels>", "<Room_Type>", "<room_nos>", "<datepick_in>", "<datepick_out>", "<adult_room>" and "<child_room>"
    Then User should verify after searching hotel get date error message as "Check-In Date shall be before than Check-Out Date", "Check-Out Date shall be after than Check-In Date"

    Examples: 
      | username    | password | location  | Hotels        | Room_Type | room_nos | datepick_in | datepick_out | adult_room | child_room |
      | rithvikansu | Kutt@123 | Melbourne | Hotel Cornice | Standard  | 4 - Four | 14/07/2022  | 10/07/2022   | 2 - Two    | 2 - Two    |

  Scenario Outline: Verifying Adactin search hotel page without entering any data
    When User should perform login "<username>","<password>"
    And User should verify after login "Hello rithvikansu!"
    And User should search hotels without entering any of the fields
    Then User should verify search hotel page error message as "Please Select a Location"

    Examples: 
      | username    | password |
      | rithvikansu | Kutt@123 |
