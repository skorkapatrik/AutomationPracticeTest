Feature: Search test

  Background:
    Given The home page is opened

  Scenario: Empty search
    Given The Search link is clicked
    Then Please enter a search keyword

  Scenario Outline:
    Given The '<field>' is filled with '<values>'
    And The Search link is clicked
    Then An '<msg>' found shown
    Examples:
      | field | values            |         msg            |
      | search_query_top | nemtalal | 0 results have been found. |
      | search_query_top | t-shirt | 1 result has been found. |
      | search_query_top | dress | 7 results have been found.  |







