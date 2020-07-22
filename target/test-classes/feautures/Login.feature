@Login
Feature: Search
 CBT-25: As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed
  Accounts are: librarian, student, admin

  @Librarian @employee @sunday

  Scenario: Librarian login scenario
    Given User is on the login page
    When User logs in as librarian
    Then User should see dashboard

  @Student
  Scenario: Student login scenario
    Given User is on the login page
    When User logs in as student
    Then User should see dashboard

  @Admin
  Scenario: Admin login scenario
    Given User is on the login page
    When User logs in as admin
    Then User should see dashboard