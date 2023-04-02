Feature: Validation of Book rooms in Adactin web application

  Background: 
    Given User launch adactin web application
    Then User verify login page is displayed

  Scenario: Tc01_ Validation of Book rooms
    When User enters valid username and password
    And User clicks Login button
    When User enters Location, Hotels, Room Type, Number of Rooms, Adults per Room,Children per Room
    And User clicks radio and continue button
    When User enters First Name, Last Name, Billing Address
    When User enters Credit Card No, Credit Card Type, Expiry Date & year, CVV Number
    And User clicks Book now

  Scenario Outline: Tc02_ Validation of Book rooms in Adactin using same login and four different locations
    When User enters valid "<username>" and "<password>"
    And User clicks Login button
    When User enters "<Location>", "<Hotels>", "<Room Type>", "<Number of Rooms>", "<Adults per Room>","<Children per Room>"
    And User clicks radio and continue button
    When User enters "<First Name>", "<Last Name>", "<Billing Address>"
    When User enters "<Credit Card No>", "<Credit Card Type>", "<Expiry Date>" & "<year>", "<CVV Number>"
    And User clicks Book now

    Examples: 
      | username        | password        | Location  | Hotels        | Room Type    | Number of Rooms | Adults per Room | Children per Room | First Name  | Last Name | Billing Address | Credit Card No   | Credit Card Type | Expiry Date | year | CVV Number |
      | balaji123123    | balaji@123      | Sydney    | Hotel Creek   | Standard     | 2 - Two         | 3 - Three       | 0 - None          | janarthanan | B         | werrtttttttttt  | 1234567890123456 | American Express | January     | 2022 |       0923 |
      | saravanan123123 | saravanan123123 | Paris     | Hotel Hervey  | Double       | 4 - Four        | 4 - Four        | 1 - One           | janarthanan | B         | werrtttttttttt  | 1234567890123456 | Master Card      | March       | 2022 |       0923 |
      | ramramram123    | ramramram123    | Melbourne | Hotel Cornice | Deluxe       | 6 - Six         | 2 - Two         | 3 - Three         | janarthanan | B         | werrtttttttttt  | 1234567890123456 | VISA             | May         | 2022 |       0923 |
      | maran2345       | maran2345       | Brisbane  | Hotel Hervey  | Super Deluxe | 8 - Eight       | 1 - One         | 4 - Four          | janarthanan | B         | werrtttttttttt  | 1234567890123456 | Other            | July        | 2022 |       0923 |