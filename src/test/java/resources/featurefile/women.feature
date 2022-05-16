
  Feature: WomenCategoryPage Test

    Scenario: verify user should navigate to women category page successfully
      Given I am on homepage
      When I click on Women tab
      Then I can verify "WOMEN" text from the page

      Scenario Outline: verify user should add product to the cart successfully
        Given I am on homepage
        When I click on Women tab
        And  I select on product "<product>" from women page
        And  I clear the quantity from quantity
        And  I change quantity "<qty>" from product page
        And  I select size "<size>" of the product from drop dawn
        And  I select colour "<colour>" of the product
        And  I click on add to cart button
        And  I can see the message "Product successfully added to your shopping cart" product added successfully
        Then I click on close button

        Examples:
          | product                                | qty | size | colour |
          | Blouse                                 | 2   | M    | White  |
          | Printed Dress                          | 3   | L    | Orange |
          | Printed Chiffon Dress                  | 4   | S    | Green  |
          | Printed Summer Dress with Price $28.98 | 2   | M    | Blue   |


