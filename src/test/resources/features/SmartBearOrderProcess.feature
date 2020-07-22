Feature: User should be able to login with correct credentials to SmaertBear
  Agile story: As a user I should be able to login to smartBear website with
  correct credentials when I am on login page


  Background:
    Given User is on SmartBear login page
    Then  User logged to SmartBear

  @SmartBear
  Scenario:
    Given User is logged into SmartBear Tester account and on Order page
    Then  User selects "FamilyAlbum" from product dropdown
    And   User enters "4" to quantity
    Then  User enters "John Wick" to costumer name
    And   User enters "Kinzie Ave" to street
    Then  User enters "Chicago" to city
    And   User enters "IL" to state
    Then  User enters zipCode "60056"
    And   User selects "Visa" as card type
    Then  User enters "1111222233334444" to card number
    Then  User enters "12/22" to expiration date
    And   User clicks process button
    Then  User verifies "John Wick" is in the list
    #1.User is logged into SmartBear Tester account and on Order page
    # 2.User fills out the form as followed:
    # 3.User selects FamilyAlbum from product dropdown
    # 4.User enters 4 to quantity
    # 5.User enters John Wick to costumer name
    # 6.User enters Kinzie Ave to street
    # 7.User enters Chicago to city
    # 8.User enters IL to state
    # 9.User enters 60056
    # 10.User selects Visa as card type
    # 11.User enters 1111222233334444 to card number
    # 12.User enters 12/22 to expiration date
    # 13.User clicks process button
    # 14.User verifiesJohn Wick is in the lis