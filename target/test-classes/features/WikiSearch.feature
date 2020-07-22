Feature: Wiki title and search verification

  Background: User is on the Wiki home page
    Given User is on the Wikipedia home page

  @wiki
  Scenario: Search functionality title verification
    When User searches "Steve Jobs" in the wiki search page
    Then User should see "Steve Jobs" in the wiki title

  @wikipage
  Scenario: Search functionality header verification
    When   User searches "Steve Jobs" in the wiki search page
    Then   User should see "Steve Jobs" in the wiki title
    Then  User should see "Steve Jobs" in the main header
    Then  User should see "Steve Jobs" in the image header

 @wikiScenarioOutline
  Scenario Outline: Search functionality header verification
    When   User searches "<SearchValue>" in the wiki search page
    Then   User should see "<expectedTitle>" in the wiki title
    Then  User should see "<expectedMainHeader>" in the main header
    Then  User should see "<expectedImageHeader>" in the image header

    Examples: example test data for wikipedia search

      | SearchValue     | expectedTitle   | expectedMainHeader | expectedImageHeader |
      | Steve Jobs      | Steve Jobs      | Steve Jobs         | Steve Jobs          |
      | John Travolta   | John Travolta   | John Travolta      | John Travolta       |
      | Albert Einstein | Albert Einstein | Albert Einstein    | Albert Einstein     |
      | Keanu Reeves    | Keanu Reeves    | Keanu Reeves       | Keanu Reeves        |
      | Bruce Lee       | Bruce Lee       | Bruce Lee          | Bruce Lee           |
      | Dua Lipa        | Dua Lipa        | Dua Lipa           | Dua Lipa            |
      | Thomas Edison   | Thomas Edison   | Thomas Edison      | Thomas Edison       |
      | Sam Heughan     | Sam Heughan     | Sam Heughan        | Sam Heughan         |
