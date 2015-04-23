package com.sun.sellTickets;

/**
 * Created by SDL on 2015/4/23.
 */
public class Ticket implements Runnable{
    private int ticket = 10;
    public void run() {
        while(ticket>0){
            ticket--;
            System.out.println("当前票数为："+ticket);
        }

    }
}
