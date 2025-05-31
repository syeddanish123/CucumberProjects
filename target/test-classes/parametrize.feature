@Datadriven
Feature: Data Driven code check with inputs

  Scenario Outline: Data driven check of code
    Given user on application homepage
    When user enetered the data into search fileds using "<Products>"
    And click on search button
    Then Relevent products should be displayed

    Examples: 
      | Products |
      | Imac     |
      | Laptop   |
      | android  |
