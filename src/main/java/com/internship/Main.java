package com.internship;

import com.internship.io.InputReadable;
import com.internship.io.OutputWriteable;
import com.internship.io.TextFileReader;
import com.internship.io.TextFileWriter;
import com.internship.utils.PathConstants;

import java.nio.file.Paths;


public class Main {
    public static void main(String[] args) {
        InputReadable fileReader = new TextFileReader(Paths.get(PathConstants.INPUT_PATH));
        OutputWriteable fileWriter = new TextFileWriter(Paths.get(PathConstants.OUTPUT_PATH));

        fileWriter.writeAnagrams(AnagramFinder.findAnagrams(fileReader.getWords()));


    }
}