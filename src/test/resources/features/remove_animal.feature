Feature: Adding and removing animals from the cart
     As a pet store customer
     They want to add a dog and a bird to the cart
     but they want to remove the bird to proceed with the purchase

  Scenario: Add a dog and a bird to the cart and remove the bird
    Given they are on the pet store homepage
    When they select the Dogs category
    And they choose the "Golden Retriever" dog
    And they add the dog to the cart
    When return to homepage
    When they select the Reptiles category
    And they choose the "Iguana"
    And they add the reptile to the cart
    When remove the Iguana from the cart
    Then they should see "Golden Retriever" in the cart
