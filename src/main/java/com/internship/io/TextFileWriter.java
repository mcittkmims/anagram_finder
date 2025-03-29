package com.internship.io;

import com.internship.logic.Histogram;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

public class TextFileWriter implements OutputWriteable{
    private Path path;

    public TextFileWriter(Path path){
        this.path = path;
    }

    @Override
    public void writeAnagrams(Map<Histogram, List<String>> anagramPairs) throws IOException{
        try (BufferedWriter writer = Files.newBufferedWriter(this.path)) {
            for(List<String> anagramPair: anagramPairs.values()){
                writer.write(String.join(" ",anagramPair));
                writer.newLine();
            }
        }
    }
}
