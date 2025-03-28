package com.internship;

import com.internship.io.InputReadable;
import com.internship.io.OutputWriteable;
import com.internship.io.TextFileReader;
import com.internship.io.TextFileWriter;

import java.nio.file.Paths;


public class Main {
    public static void main(String[] args) {
        InputReadable fileReader = new TextFileReader(Paths.get("src/main/resources/input.txt"));
        OutputWriteable fileWriter = new TextFileWriter(Paths.get("src/main/resources/output.txt"));

        fileWriter.writeAnagrams(AnagramFinder.findAnagrams(fileReader.getWords()));

    }
}