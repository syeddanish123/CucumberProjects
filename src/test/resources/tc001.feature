@Smoke
Feature: Check the main functionality

  Scenario: checking the cart functionality working correct or not
    Given user on application homepage using <"https://tutorialsninja.com/demo/index.php?route=common/home">
    When user click on cart
    Then cart page should be displayed
