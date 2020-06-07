# mf
Repository of mf

Problem
Write a function that, given a string of text (possibly with punctuation and line-breaks), returns an array of the top-3 most occurring words, in descending order of the number of occurrences.

Assumptions: A word is a string of letters (A to Z) optionally containing one or more apostrophes (’) in ASCII. (No need to handle fancy punctuation.) Matches should be case-insensitive, and the words in the result should be lowercased. Ties may be broken arbitrarily. If a text contains fewer than three unique words, then either the top-2 or top-1 words should be returned, or an empty array if a text contains no words.

Solution/logic:

Algorithm/lqgic
    1) Define the input string string.
    2) Convert the string into lowercase to make the comparison insensitive and replace special chracters other than "'".
    3) Split the string into words.
    4) Loop through the array and create word as key and count. Increase the count if the word exists in the Map 
    5) Sort the Map by using the Values and create a list and return the Array for the desired number of words

How to test?

1) clone the repository into your working directory . E.g mf

2) Go to your working directory and execute the the command "./gradlew init clean test"

3) you can see the the test report  here on the successful test execution and the code coverage for the testes in "mf/build/reports/tests/test/index.html

