package com.internship.io;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TextFileReader implements InputReadable{

    private Path path;

    public TextFileReader(Path path){
        this.path = path;
    }

    @Override
    public List<String> getWords() {
        try {
            return Files.readAllLines(path, StandardCharsets.UTF_8);
        } catch (IOException e){
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
