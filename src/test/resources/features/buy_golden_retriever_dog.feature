Feature: Buying a dog in the pet store
          As a pet store customer
          They want to buy a Golden Retriever dog
          So that they can have a new pet


  Scenario: Buy a Golden Retriever dog
    Given they are on the pet store homepage
    When they log in to the store
    And they select the Dogs category
    And they choose the "Golden Retriever" dog
    And they add the dog to the cart
    And they proceed to checkout
    Then they should see the following confirmation message: "Thank you, your order has been submitted."