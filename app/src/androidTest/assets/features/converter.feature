Feature: Converter
Converts Decimals to Roman numerals

@smoke
@e2e
Scenario Outline: Input a correct Decimal to convert into Roman numerals

  Given I have a Converter Activity
  When I input decimal in decimal field <Decimal>
  And I select Convert button
  Then I should get the equivalent roman number <Result>

Examples:
|Decimal        |Result     |
|5              |V          |
|3              |III        |
|4              |IV         |
|9              |X          |
|14             |XIV        |
