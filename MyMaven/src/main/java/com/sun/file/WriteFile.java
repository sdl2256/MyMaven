package com.sun.file;

import com.sun.util.TimeUtil;

import javax.annotation.PreDestroy;
import java.io.*;

/**
 * Created by SDL on 2015/4/24.
 */
public class WriteFile {

    FileOutputStream out = null;
    OutputStreamWriter outputStreamWriter = null;
    BufferedWriter bufferedWriter= null;
    public WriteFile(String filename) {
        try {
            out = new FileOutputStream(filename,true);
            outputStreamWriter = new OutputStreamWriter(out);
            bufferedWriter = new BufferedWriter(outputStreamWriter);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void write(String text) throws IOException {

        bufferedWriter.write(text);
    }

   @PreDestroy
    public void destroyMed() throws IOException {
        out.close();
    }

}
