@auto
Feature: Auto Quote Test

Background:
* say hello!

  @smoke 
  Scenario: Validate Auto Quote
    Given user title is <'Create an affordable price, just for you'>
    And user clicks product
    When user insert zipcode <'19082'>
    And user clicks startAquote
    Then user is in personalPricePlan
    When user insert firstName <'Shumi'>
    And user insert middleName <'R'>
    And user insert lastName <'Akter'>
    And user selects suffic <'Jr'>
    And user insert address <'7120 sellers Ave'>
    And user insert apartment <'2nd'>
    And user insert dateOfBirth <'10201978'>
    
@regression 
  Scenario Outline: Validate Auto Quote homepage title
    Given user title is <'Create an affordable price, just for you'>
    And user clicks product
    When user insert zipcode <'19082'>
    And user clicks startAquote
 
    Examples:
    |zipCode|
    |'19082'|
    |'19082'|
    |'19082'|
    
