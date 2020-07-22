Feature: Smart Bear outline practices

  Background:
    Given User is on SmartBear login page
    Then User logged to SmartBear


  @smartBearScenarioOutline
  Scenario Outline:Smart bear
    Given User is logged into SmartBear Tester account and on Order page
    Then User selects "<product>" from product dropdown
    And User enters "<quantity>" to quantity
    Then User enters "<customerName>" to costumer name
    And User enters "<street>" to street
    Then User enters "<city>" to city
    And User enters "<state>" to state
    Then User enters zipCode "<zipCode>"
    And User selects "<cardType>" as card type
    Then User enters "<cardNumber>" to card number
    Then  User enters "<expirationDate>" to expiration date
    And User clicks process button
    Then User verifies "<expectedName>" is in the list

    Examples:
      | product     | quantity | customerName    | street      | city        | state | cardType | zipCode | cardNumber   | expirationDate | expectedName    |
      | MyMoney     | 1        | Ken Adams       | Kinzie st   | Chicago     | visa  | IL       | 60004   | 123456789315 | 12/22          | Ken Adams       |
      | FamilyAlbum | 4        | Joey Tribbiani  | State st    | Chicago     | visa  | IL       | 60656   | 123456789316 | 11/22          | Joey Tribbiani  |
      | ScreenSaver | 5        | RachelGreen     | Michigan st | Chicago     | visa  | IL       | 60056   | 123456789317 | 10/22          | RachelGreen     |
      | MyMoney     | 5        | Chandler Bing   | Erie st     | Chicago     | visa  | IL       | 60666   | 123456789318 | 10/22          | Chandler Bing   |
      | FamilyAlbum | 9        | Dr DrakeRamoray | Dale st     | Arl Hgths   | visa  | IL       | 60452   | 123456789319 | 10/22          | Dr DrakeRamoray |
      | ScreenSaver | 10       | Monica Geller   | Euclid ave  | Arl Hgths   | visa  | IL       | 60312   | 123456789320 | 10/22          | Monica Geller   |
      | MyMoney     | 3        | Ross Geller     | River rd    | Des Plaines | visa  | IL       | 60666   | 123456789321 | 10/22          | Ross Geller     |
      | MyMoney     | 1        | Ken Adams       | Kinzie st   | Chicago     | visa  | IL       | 60312   | 123456789322 | 12/22          | Ken Adams       |