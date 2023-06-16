package week3;

class BookingThread extends Thread {
    Ticket bookingSystem;
    String passengerName;

    public BookingThread(Ticket bookingSystem, String passengerName) {
        this.bookingSystem = bookingSystem;
        this.passengerName = passengerName;
    }

    @Override
    public void run() {
        bookingSystem.bookTicket(passengerName);
    }
}