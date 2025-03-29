package com.internship;

import com.internship.io.InputReadable;
import com.internship.io.OutputWriteable;
import com.internship.logic.AnagramFinder;
import com.internship.logic.Histogram;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Processor {

    private InputReadable inputReader;
    private OutputWriteable outputWriter;


    public Processor(InputReadable inputReader, OutputWriteable outputWriter) {
        this.inputReader = inputReader;
        this.outputWriter = outputWriter;
    }

    public void execute(){
        try(Stream<String> words = inputReader.getWords()){
            Map<Histogram, List<String>> anagramPairs = AnagramFinder.findAnagrams(words);
            this.outputWriter.writeAnagrams(anagramPairs);
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}
