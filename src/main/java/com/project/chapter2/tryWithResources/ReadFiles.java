package com.project.chapter2.tryWithResources;

import java.io.*;

public class ReadFiles {

    public String firstOfLine(String fileDir) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(fileDir))) {
            return br.readLine();
        }
    }

    public void copy(String from, String to) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(to));
             BufferedReader br = new BufferedReader(new FileReader(from))) {

            bw.write(br.readLine());
        }
    }

}
