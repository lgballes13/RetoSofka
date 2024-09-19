Feature: Consulting reptile classes in the pet store
          As a pet store customer
          They want to consult all classes of reptiles
          So that they can know the available options

  Scenario: Consult all classes of reptiles
    Given they are on the pet store homepage
    When they select the Reptiles category
    Then they should see a list of all classes of reptiles
    |reptiles|
    |Rattlesnake|
    |Iguana     |
