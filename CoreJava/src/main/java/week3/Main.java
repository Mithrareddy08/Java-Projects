package week3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

   //   System.out.println("Enter a string");
    //  Scanner sc = new Scanner(System.in);
    //   String s1=sc.nextLine();
     //  MyExcep n=new MyExcep();
    //  n.Custom(s1);


      //  printNum1 nt=new printNum1();
      //  printNum nr=new printNum();
      //  Thread t= new Thread(nr);
      //  nt.start();
     //   t.start();

        Ticket bookingSystem = new Ticket();

        BookingThread passenger1 = new BookingThread(bookingSystem, "Priya");
        BookingThread passenger2 = new BookingThread(bookingSystem, "Sneha");
        BookingThread passenger3 = new BookingThread(bookingSystem, "Rash");
        BookingThread passenger4 = new BookingThread(bookingSystem, "Sanj");
        BookingThread passenger5 = new BookingThread(bookingSystem, "Rosh");
        BookingThread passenger6 = new BookingThread(bookingSystem, "Rishi");

        passenger1.start();
        passenger2.start();
        passenger3.start();
        passenger4.start();
        passenger5.start();
        passenger6.start();


    }
}

