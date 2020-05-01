Feature: ContactUs feature test

  Background:
    Given The home page is opened
    And The ContactUs link is clicked

  Scenario: Invalid email address
    Given The Send link is clicked
    Then Invalid email address

  Scenario: Blank message
    Given Valid email filled
    And The Send link is clicked
    Then The message cannot be blank

  Scenario: Unselected subject
    Given Valid email filled
    And Valid message filled
    And The Send link is clicked
    Then Please select a subject from the list provided

  Scenario: Message Sent
    Given Valid email filled
    And Valid message filled
    And Subject Selected
    And The Send link is clicked
    Then Your message has been successfully sent to our team



