package com.internship.io;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface OutputWriteable {
    void writeAnagrams(Map<String, List<String>> anagramPairs);
}

