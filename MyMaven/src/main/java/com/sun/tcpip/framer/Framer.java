package com.sun.tcpip.framer;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by SDL on 2015/4/15.
 */
public interface Framer {

    // adds framing information and outputs a given message to a given stream
    void frameMsg(byte[] message, OutputStream out) throws IOException;

    //scans a given stream, extracting the next message.
    byte[] nextMsg() throws  IOException;
}
