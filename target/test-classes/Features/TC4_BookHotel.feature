@BookHotel
Feature: Verifying Adactin Hotel Booking details

  Background: 
    Given User is on the Adactin Page

  Scenario Outline: Verifying Adactin book hotel page by selecting all fields
    When User should perform login "<username>","<password>"
    And User should verify after login "Hello rithvikansu!"
    And User should search hotels "<location>", "<Hotels>", "<Room_Type>", "<room_nos>", "<datepick_in>", "<datepick_out>", "<adult_room>" and "<child_room>"
    Then User should verify whether it is navigating to Select hotel page "Select Hotel"
    And User should select a hotel
    Then User should verify after selecting a hotel confirmation message in book hotel page as "Book A Hotel"
    And User should Book hotel "<firstName>", "<lastName>" and "<address>"
      | Card_No          | Card_Type        | Expiry_Month | Expiry_Year | Cvv_No |
      | 1234567891234567 | American Express | February     |        2021 |    123 |
      | 2541639874123654 | VISA             | May          |        2022 |    235 |
      | 4789654123654789 | Master Card      | November     |        2015 |    789 |
      | 8596741236547896 | Other            | March        |        2018 |    456 |
    Then User should verify the message after hotel booking in booking confirmation page as "Booking Confirmation"

    Examples: 
      | username    | password | location  | Hotels        | Room_Type | room_nos | datepick_in | datepick_out | adult_room | child_room | firstName | lastName | address       |
      | rithvikansu | Kutt@123 | Melbourne | Hotel Cornice | Standard  | 4 - Four | 14/07/2022  | 24/07/2022   | 2 - Two    | 2 - Two    | Viveka    | Shiva    | Thiruvanmiyur |

  Scenario Outline: Verifying Adactin book hotel page without selecting any fields
    When User should perform login "<username>","<password>"
    And User should verify after login "Hello rithvikansu!"
    And User should search hotels "<location>", "<Hotels>", "<Room_Type>", "<room_nos>", "<datepick_in>", "<datepick_out>", "<adult_room>" and "<child_room>"
    Then User should verify whether it is navigating to Select hotel page "Select Hotel"
    And User should select a hotel
    Then User should verify after selecting a hotel confirmation message in book hotel page as "Book A Hotel"
    And User should Book a hotel without selecting any fields in book hotel page
    Then User should Verify the error message without selecting any fields in book hotel page as "Please Enter your First Name", "Please Enter you Last Name", "Please Enter your Address", "Please Enter your 16 Digit Credit Card Number", "Please Select your Credit Card Type", "Please Select your Credit Card Expiry Month" and "Please Enter your Credit Card CVV Number"

    Examples: 
      | username    | password | location  | Hotels        | Room_Type | room_nos | datepick_in | datepick_out | adult_room | child_room |
      | rithvikansu | Kutt@123 | Melbourne | Hotel Cornice | Standard  | 4 - Four | 14/07/2022  | 24/07/2022   | 2 - Two    | 2 - Two    |
