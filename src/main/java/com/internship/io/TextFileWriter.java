package com.internship.io;


import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.List;

public class TextFileWriter implements OutputWriteable{
    private Path path;

    public TextFileWriter(Path path){
        this.path = path;
    }

    @Override
    public void writeAnagrams(Collection<List<String>> anagramPairs) throws IOException{
        try (BufferedWriter writer = Files.newBufferedWriter(this.path)) {
            for(List<String> anagramPair: anagramPairs){
                writer.write(String.join(" ",anagramPair));
                writer.newLine();
            }
        }
    }
}
