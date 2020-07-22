#EstySeach.feature(TC-51-52-53)

  Feature: Etsy Title verification
    Agile Story: User is on Etsy page ,search and see title is a expected.
  Background: User should be on the Etsy page
    Given  User is on https://www.etsy.com

    @EtsyTitle
    Scenario: Etsy title verification
      Then    User should see Etys title is expected
      #Expected:Etsy-Shop for handmade, vintage,custom,and unique gifts for everyone

    @EtsySearchFunction
    Scenario: Etsy search functionality title verification
      Then User types Wooden Spoon in the search box
      And  User click search button
      Then User sees Wooden Spoon on the title
     #with out parameterization

    @EtsySearchFunctionWithParameterization
    Scenario: Etsy search functionality title verification(with Parameterization)
      Then User types "Wooden Spoon" in the search box
      And  User click search button
      Then User sees "Wooden Spoon" on the title



