package com.internship;

import java.util.*;

public class AnagramFinder {

    public static Map<String, List<String>> findAnagrams(List<String> words) {
        Map<String, List<String>> pairedAnagrams = new HashMap<>();
        for (String word: words){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            pairedAnagrams.putIfAbsent(sortedWord, new ArrayList<>());
            pairedAnagrams.get(sortedWord).add(word);
        }
        return pairedAnagrams;
    }


}
