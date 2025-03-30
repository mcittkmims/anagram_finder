package com.internship.io;


import java.io.IOException;
import java.util.Collection;
import java.util.List;


public class ConsoleWriter implements OutputWriteable {
    @Override
    public void writeAnagrams(Collection<List<String>> anagramPairs) throws IOException {
        for(List<String> anagrams : anagramPairs) {
            System.out.println(String.join(" ", anagrams));
        }
    }
}
