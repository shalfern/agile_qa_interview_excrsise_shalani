Note: I have worked in the test with IntelliJ. I couldn't get the test to work from the console, so I tested using manual strings within the code. I am using my office laptop. I have included a mix of specflow steps on how we can use it to test which again have the potential to be extended more 


Tasks

1. Review the user story and prepare a list of questions/ assumptions.
  - Is there a min/max amount of letters in a string?
  - Can the input includes other characters such as symbols/numbers/spaces?
  - If there's anything other than letters are used as an input what should be the expected outcome?
  - What if both letters and numbers are included in the string, should the outcome ignore the numbers and proceed or give an error?
  - Is there only one error message for all the error's?


2. Review the code and provide feedback/ improvements.
  - The string did not recognise capital letters (update code to ignore case)
  - It didn't recognise the maximum of 4 strings as it gave an error.
  - The error message is the same for any incorrect input, maybe give some valuable feedback to the user like "input is not supported, try again"  

3. Extend the program to return the number of consonants for each string array passed.

   private Integer getConstantCount(String input) {
   String[] inputChars = input.split("");
   return (int) Arrays.stream(inputChars).filter(inputChar -> !inputChar.matches("[aeiou]")).count();
   }
--I have extended the same method for the constants to return the count of any constants that does not match the string.

4.Use BDD/ Cucumber to add test cases to test the program for both vowels and consonants.
  - Test cases added to project 

5.Report any bugs you find.
  - The string did not recognise capital letters
  - It didn't recognise the maximum of 4 strings as it gave an error

Note: I didn't have time to figure out the cucumber test report.