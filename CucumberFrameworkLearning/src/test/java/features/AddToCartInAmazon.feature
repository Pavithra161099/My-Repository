@E2E
Feature: Add product to cart in amazon

  Background: 
    Given User should navigate to the amazon application

  Scenario Outline: Add product to cart
    And Search product "<book>"
    And Add to cart
    Then Cart badge should be updated

    @test
    Examples: 
      | book                                                           |
      | Start Living Again                                             |
      | Rich Dad Poor Dad : What the Rich Teach Their Kids About Money |

    @dev
    Examples: 
      | book                |
      | Fix Her Up: A Novel |
