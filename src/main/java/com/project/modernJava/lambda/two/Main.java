package com.project.modernJava.lambda.two;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {

        String processedOneLineFile = processFile(o1 -> o1.readLine());
        String processedTwoLinesFile = processFile(o1 -> o1.readLine() + o1.readLine());

    }

    @SneakyThrows
    private static String processFile(BufferedReaderProcessor processor) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"))) {
            return processor.process(bufferedReader);
        }
    }


}
