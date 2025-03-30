package com.internship;

import com.internship.io.*;
import com.internship.utils.PathConstants;

import java.nio.file.Paths;


public class Main {
    public static void main(String[] args) {
        InputReadable fileReader = new TextFileReader(Paths.get(PathConstants.INPUT_PATH));
        OutputWriteable fileWriter = new TextFileWriter(Paths.get(PathConstants.OUTPUT_PATH));
        OutputWriteable outputWriter = new ConsoleWriter();

        Processor processor = new Processor(fileReader, fileWriter);
        processor.execute();

        processor.setOutputWriter(outputWriter);
        processor.execute();
    }
}