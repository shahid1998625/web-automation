Feature: Launching Google Page


@Test
    @test
    Scenario: Launching Google Page
    Scenario Outline: GJHJBK
    Given User Launches Browser
    When User Searches for "<st>"
    Then User Clicks on Search Button


    Examples:
    | st               |
    | Quality Matrix   |


