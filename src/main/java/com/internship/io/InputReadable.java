package com.internship.io;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

public interface InputReadable {
    Stream<String> getWords() throws IOException;
}
