package com.internship;

import java.util.*;
import java.util.stream.Stream;

public class AnagramFinder {

    public static Map<String, List<String>> findAnagrams(Stream<String> words) {
        Map<String, List<String>> pairedAnagrams = new HashMap<>();
        words.forEach(word -> {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            pairedAnagrams.putIfAbsent(sortedWord, new ArrayList<>());
            pairedAnagrams.get(sortedWord).add(word);
        });
        return pairedAnagrams;
    }


}
