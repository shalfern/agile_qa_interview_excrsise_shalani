package com.exercise;

public class Main {

    public static void main(String[] args) {
        String[] Input = new String[]{"cat", "test", "monkey"};
        VowelCounter counter = new VowelCounter();
        var result = counter.getVowelListWithCount(Input);
        System.out.println(result);
    }
}
