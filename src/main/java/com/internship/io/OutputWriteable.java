package com.internship.io;

import com.internship.logic.Histogram;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface OutputWriteable {
    void writeAnagrams(Map<Histogram, List<String>> anagramPairs) throws IOException;
}

