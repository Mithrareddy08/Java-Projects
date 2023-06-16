package week3;

import java.util.ArrayList;
import java.util.List;

class Ticket{
    int ti=5;
    List<String> bookedTickets=new ArrayList<>();
    public synchronized boolean bookTicket(String pName) {
        if (ti > 0) {
            ti--;
            bookedTickets.add(pName);
            System.out.println("Name of the passenger: " + pName);
            return true;
        } else {
            System.out.println("no tickets available.");
            return false;
        }
    }
}