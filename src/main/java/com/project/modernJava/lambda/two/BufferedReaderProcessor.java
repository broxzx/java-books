package com.project.modernJava.lambda.two;

import java.io.BufferedReader;
import java.io.IOException;

@FunctionalInterface
public interface BufferedReaderProcessor {

    String process(BufferedReader reader) throws IOException;

}
