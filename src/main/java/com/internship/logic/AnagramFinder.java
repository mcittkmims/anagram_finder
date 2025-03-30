package com.internship.logic;

import java.util.*;
import java.util.stream.Stream;

public class AnagramFinder {

    public static Map<Histogram, List<String>> findAnagrams(Stream<String> words) {
        Map<Histogram, List<String>> pairedAnagrams = new HashMap<>();
        words.forEach(word -> {
            Histogram histogram = new Histogram(word);
            pairedAnagrams.putIfAbsent(histogram, new ArrayList<>());
            pairedAnagrams.get(histogram).add(word);
        });
        return pairedAnagrams;
    }

    public static Map<Histogram, List<String>> findAnagrams(List<String> words) {
        return findAnagrams(words.stream());
    }



}
