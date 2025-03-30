package com.internship.io;


import java.io.IOException;
import java.util.Collection;
import java.util.List;


public interface OutputWriteable {
    void writeAnagrams(Collection<List<String>> anagramPairs) throws IOException;
}

