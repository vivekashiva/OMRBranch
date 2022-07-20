@CancelBooking
Feature: Verifying Adactin Hotel Cancel Booking page details

  Background: 
    Given User is on the Adactin Page

  Scenario Outline: Verifying Adactin hotel Cancel Booking page
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
    And User should cancel the order ID
    Then User should verify the successful cancelled orderID message in Booked Itinerary page as "The booking has been cancelled."

    Examples: 
      | username    | password | location  | Hotels        | Room_Type | room_nos | datepick_in | datepick_out | adult_room | child_room | firstName | lastName | address       |
      | rithvikansu | Kutt@123 | Melbourne | Hotel Cornice | Standard  | 4 - Four | 14/07/2022  | 24/07/2022   | 2 - Two    | 2 - Two    | Viveka    | Shiva    | Thiruvanmiyur |

  Scenario Outline: Verifying Adactin hotel Cancel Booking page by cancelling existing order-ID
    When User should perform login "<username>","<password>"
    And User should verify after login "Hello rithvikansu!"
    And User should cancel the booked order ID "<order-ID>"
    Then User should verify the successful cancelled orderID message in Booked Itinerary page as "The booking has been cancelled."

    Examples: 
      | username    | password | order-ID   |
      | rithvikansu | Kutt@123 | 2MS72962WZ |
