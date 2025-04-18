package com.internship;

import com.internship.io.InputReadable;
import com.internship.io.OutputWriteable;
import com.internship.logic.AnagramFinder;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
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
            Collection<List<String>> anagramPairs = AnagramFinder.findAnagrams(words);
            this.outputWriter.writeAnagrams(anagramPairs);
        } catch(IOException e) {
            e.printStackTrace();
        }

    }

    public void setInputReader(InputReadable inputReader) {
        this.inputReader = inputReader;
    }

    public void setOutputWriter(OutputWriteable outputWriter) {
        this.outputWriter = outputWriter;
    }
}
