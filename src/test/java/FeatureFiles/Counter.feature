Feature: Counter

  Scenario: User should be able to get number of vowels
    Given the user has input a string
    Then the user should receive the number of vowels

Scenario Outline: User should be able to get number of constants
  Given the user has input a <string>
  Then the user should receive the <number> of constants

  Examples:
  | string                    | number     |
  | monkey, test, tikyo, test | 3, 3, 3, 3 |
  | monkey, test234           | 3, 3       |
  | New york                  | 5          |

  Given the user has input 4 strings
  Then the user should get correct number of vowels and constants

  Given the user has input 5 strings
  Then the user should receive an error

  Given the user has a string with other characters
  Then the user should receive an error

  Given the user sends an empty string
  Then the user should receive an error




