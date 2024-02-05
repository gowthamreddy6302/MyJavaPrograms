package Multi_Threading.Synchronization;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

public class TicketBooking {
    static boolean booked = false;

    public static synchronized void bookTicket(String name) {
        if (booked == false) {
            System.out.println(name + ": SELECTED THE SEAT");
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
            }
            System.out.println(name + ": COMPLETED THE PAYMENT");
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
            }
            System.out.println(name + ": GET THE TICKET");
            booked = true;
        } else {
            System.out.println("SORRY " + name + ", THIS SEAT IS ALREADY BOOKED");
        }
    }
}

class ThreadClass extends Thread {
    TicketBooking ticketBooking;
    String name;

    public ThreadClass(TicketBooking ticketBooking, String name) {
        this.ticketBooking = ticketBooking;
        this.name = name;
    }

    public void run() {
        try {
            TicketBooking.bookTicket(name);
        } catch (Exception e) {
            throw new RuntimeException("BOOKING FAILED");
        }
    }
}

class SyncEx {
    public static void main(String[] args) throws InterruptedException {
        TicketBooking ticketBooking = new TicketBooking();
        ThreadClass santhosh = new ThreadClass(ticketBooking, "Santhosh");
        Thread thread = new Thread(santhosh);
        thread.start();
        try {
            thread.join();
        } catch (Exception e) {
        }

        // SECOND-THREAD


        ThreadClass suresh = new ThreadClass(ticketBooking, "Suresh");
        Thread thread1 = new Thread(suresh);
        thread1.start();
    }
}