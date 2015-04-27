package com.sun.file;

import java.io.*;

/**
 * Created by SDL on 2015/4/24.
 */
public class ReadFile {

    public void read1() throws FileNotFoundException {
        File file = new File("hello.txt");

        FileInputStream in = new FileInputStream(file);
    }

    public void read2() throws FileNotFoundException {
        File file = new File("hello.txt");

        FileInputStream in = new FileInputStream(file);

        InputStreamReader inReader = new InputStreamReader(in);

        BufferedReader bufReader = new BufferedReader(inReader);
    }

    public void read3() throws FileNotFoundException {
        File file = new File("hello.txt");

        FileReader fileReader = new FileReader(file);

        BufferedReader bufReader = new BufferedReader(fileReader);
    }

}
