package com.udpecho;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by SDL on 2015/4/14.
 */
public class UDPEchoClientTimeout {
    private static int TIMEOUT = 3000;// Resend timeout (milliseconds)
    private static final int MAXTRIES = 5; // Maximum retransmissions

    public static void main(String[] args) throws IOException {
        if ((args.length < 2) || (args.length > 3)) { // Test for correct # of args
            throw new IllegalArgumentException("Parameter(s): <Server> <Word> [<Port>]");
        }

        InetAddress address = InetAddress.getByName(args[0]); // Server address
        // Convert the argument String to bytes using the default encoding
        byte[] bytesToSend = args[1].getBytes();

        int servPort = (args.length == 3) ? Integer.parseInt(args[2]) : 7;

        DatagramSocket socket = new DatagramSocket();

        socket.setSoTimeout(TIMEOUT);// Maximum receive blocking time (milliseconds)

        // Sending packet
        DatagramPacket sendPacket = new DatagramPacket(bytesToSend, bytesToSend.length, address, servPort);
        // Receiving packet
        DatagramPacket receivePacket = new DatagramPacket(new byte[bytesToSend.length], bytesToSend.length);

        int tries = 0; // Packets may be lost, so we have to keep trying
        boolean receivedResponse = false;
        do {
            socket.send(sendPacket); // Send the echo string
            try {
                socket.receive(receivePacket); // Attempt echo reply reception
                // Check source
                if (!receivePacket.getAddress().equals(address)) {
                    throw new IOException("Received packet from an unknown source");
                }
                receivedResponse = true;
            } catch (InterruptedIOException e) {// We did not get anything
                tries++;
                System.out.println("Timed out, " + (MAXTRIES - tries) + " more tries...");
            }
        } while ((!receivedResponse) && (tries < MAXTRIES));

        if (receivedResponse) {
            System.out.println("Received: " + new String(receivePacket.getData()));
        } else {
            System.out.println("No response -- giving up.");
        }

        socket.close();
    }
}
