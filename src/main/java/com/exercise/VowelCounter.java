package com.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VowelCounter {

    public List<CountResult> getVowelListWithCount(String[] args) {
        if (args.length >= 4) {
            System.out.println("Extra arguments passed.");
            return null;
        } else {
            List<String> argumentList = Arrays.asList(args);
            List<CountResult> vowelCount = new ArrayList<>();
            argumentList.forEach(argument -> vowelCount.add(new CountResult(argument, getVowelCount(argument))));
            return vowelCount;
        }
    }

    private Integer getVowelCount(String input) {
        String[] inputChars = input.split("");
        return (int) Arrays.stream(inputChars).filter(inputChar -> inputChar.matches("[aeiou]")).count();
    }

    private Integer getConstantCount(String input) {
        String[] inputChars = input.split("");
        return (int) Arrays.stream(inputChars).filter(inputChar -> !inputChar.matches("[aeiou]")).count();
    }
    // I have extended the same method for the constants to return the count of any constants that does not match the count.

}
