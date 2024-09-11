@sanity
Feature: letcode application demo

  Background: 
    Given User should navigate to the application
    And Click on login link

@reg
  Scenario: Login should be success
    And User enter the username as "preethi161099@gmail.com"
    And User enter the password as "PaVi@161099"
    When User click the login button
    Then login should be successful
@reg @smoke
  Scenario: Login should be fail
    And User enter the username as "pavithraraman2@gmail.com"
    And User enter the password as "PaVi"
    When User click the login button
    But login should fail
