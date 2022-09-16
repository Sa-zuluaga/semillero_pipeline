package com.sazuluaga.semillero.counter;

import com.sazuluaga.semillero.model.Summary;

import java.io.IOException;

public interface WordCounter {
    Summary process(String pathFile) throws IOException;

}
