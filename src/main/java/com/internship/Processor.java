package com.internship;

import com.internship.io.InputReadable;
import com.internship.io.OutputWriteable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Processor {

    private InputReadable inputReader;
    private OutputWriteable outputWriter;

    public Processor(InputReadable inputReader, OutputWriteable outputWriter) {
        this.inputReader = inputReader;
        this.outputWriter = outputWriter;
    }

    public void execute(){
        List<String> words = inputReader.getWords();
        Map<String, List<String>> anagramPairs = AnagramFinder.findAnagrams(words);
        this.outputWriter.writeAnagrams(anagramPairs);
    }
}
