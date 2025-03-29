package com.internship.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class TextFileReader implements InputReadable{

    private Path path;

    public TextFileReader(Path path){
        this.path = path;
    }

    @Override
    public Stream<String> getWords() throws IOException{
        return Files.lines(this.path);
    }
}
