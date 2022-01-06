# language: en
  # Author: Choucair Testing
Feature: Academy Choucair
  As a user, I want to learn how to automate in screenplay at the Choucair Academy with automation course
  @AddTShirtToCart @Cases
  Scenario: Search for new clothes and buy it
    Given than Michael wants to shop in New Experience
    When he search for new clothes for him
    Then he successfully add a new product at the checkout
    |strAnswer|
    |Faded Short Sleeve T-shirts|

  @AddTwoProductsAndRegisterAnUserToBuy @Cases
  Scenario: Search for new products, register and buy
    Given than Michael wants to shop in New Experience
    When he buys products at two sections and registers to do the full checkout
      |strName|strLastName|strPassword|strAddress       |strCity|strState|strZIP|strPhone  |
      |Ever   |Arroyo     |msm9709    |Villa del Rosario|Cucuta |Alabama |12345 |3152689547|
  Then he does a successfully payment
    |strAnswer2|
    |Your order on My Store is complete.|