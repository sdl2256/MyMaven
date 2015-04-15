package com.sun.tcpip.vote;

import java.io.IOException;

/**
 * Created by SDL on 2015/4/15.
 * To illustrate the different methods of encoding information, we present
 * two implementations of VoteMsgCoder,
 * one using a text-based encoding
 * and one using a binary encoding.
 *
 */
public interface VoteMsgCoder {
    byte[] toWire(VoteMsg msg) throws IOException;
    VoteMsg fromWire(byte[] input) throws IOException;
}
