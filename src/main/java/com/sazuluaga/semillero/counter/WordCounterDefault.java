package com.sazuluaga.semillero.counter;

import com.sazuluaga.semillero.model.Summary;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WordCounterDefault implements WordCounter {

    @Override
    public Summary process(String pathFile) throws IOException {
        Path path = Paths.get(pathFile);
        long numberOfLines = Files.lines(path).count();
        long numberOfWords = Files.lines(path).count()
                .map(line -> line.split(regex: " "))
                .mapToInt(wordsOfLine -> wordsOfLine.length)
                .sum();
        return new Summary(numberOfLines, numberOfWords);
    }
}
