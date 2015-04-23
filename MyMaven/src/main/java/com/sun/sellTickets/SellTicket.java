package com.sun.sellTickets;

/**
 * Created by SDL on 2015/4/23.
 */
public class SellTicket {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        new Thread(t).start();
        new Thread(t).start();
    }
}
