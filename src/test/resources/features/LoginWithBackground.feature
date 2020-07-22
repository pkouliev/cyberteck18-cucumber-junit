
@loginWithBackground
Feature: Login feature
  CBT-25: As a user, I should be able to login with correct credentials
  to different accounts, and dashboard should be displayed.
  #this is how you comment in feature file

  Background: Backstory is that user is on the login page
    Given User is on the login page
    #Then User sees title is Library

  Scenario: Librarian login scenario
    When User logs in as librarian
    Then User should see dashboard


  Scenario: Student login scenario
    When User logs in as student
    Then User should see dashboard

  @db
  Scenario: Admin login scenario
    #before step running here
    When User logs in as admin
    #after step runs here
    #before step runs here
    Then User should see dashboard
  #after step runs here
    #After annotation runs here