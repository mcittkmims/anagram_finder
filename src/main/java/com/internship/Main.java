package com.internship;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("act", "cat" , "tree" , "race" , "care" , "acre" , "bee"));
        Map<String, List<String>> result = AnagramFinder.findAnagrams(words);
        System.out.println(result);
    }
}