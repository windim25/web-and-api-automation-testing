Feature: Test Automation Web

  @web
  Scenario: Test login web normal
    Given open web login page
    And user input username "standard_user"
    And user input password "secret_sauce"
    And user click login button
    And user will see icon cart in homepage

  @web
  Scenario: Test login web with lock user
    Given open web login page
    And user input username "locked_out_user"
    And user input password "secret_sauce"
    And user click login button
    And user will see err message "user has been locked out"

  @web
  Scenario: Test login web with username and password invalid
    Given open web login page
    And user input username "locked_out_user"
    And user input password "secret_saucess"
    And user click login button
    And user will see err message "Username and password do not match"

  @web
  Scenario: Test login web add to cart
    Given open web login page
    And user input username "standard_user"
    And user input password "secret_sauce"
    And user click login button
    And user will see icon cart in homepage
    And user add item to cart
    And user add item to cart
    And user add item to cart
    Then verify cart item is match "3"

  @web
  Scenario: Test login web remove to cart
    Given open web login page
    And user input username "standard_user"
    And user input password "secret_sauce"
    And user click login button
    And user will see icon cart in homepage
    And user add item to cart
    And user add item to cart
    And user add item to cart
    Then verify cart item is match "3"
    And user remove item to cart
    And user remove item to cart
    Then verify cart item is match "1"

  @web
  Scenario: Test login web to checkout
    Given open web login page
    And user input username "standard_user"
    And user input password "secret_sauce"
    And user click login button
    And user will see icon cart in homepage
    And user add item to cart
    And user add item to cart
    Then verify cart item is match "2"
    And user proceed to checkout
    And user click checkout button
    And user input checkout information firstname "Win"
    And user input checkout information lastname "Mal"
    And user input checkout information postalcode "1234"
    And user confirm order details
    And user complete the purchase
    Then user should see confirmation message "Thank you for your order!"

  @web
  Scenario: Test login web full end-to-end flow
    Given open web login page
    And user input username "standard_user"
    And user input password "secret_sauce"
    And user click login button
    And user will see icon cart in homepage
    And user add item to cart
    Then verify cart item is match "1"
    And user proceed to checkout
    And user click checkout button
    And user input checkout information firstname "Win"
    And user input checkout information lastname "Mal"
    And user input checkout information postalcode "1234"
    And user confirm order details
    And user complete the purchase
    Then user should see confirmation message "Thank you for your order!"
    And user will see icon menu in homepage
    And user click logout button


