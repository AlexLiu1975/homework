package com.train;

public class Tickets {


        int ticket;
        int round_trip;


        public Tickets(int ticket, int round_trip) {
            this.ticket = ticket;
            this.round_trip = round_trip;

        }
        public void print() {
            int total = 0;
            if (ticket >= round_trip) {
                total = ((ticket-round_trip) * 1000) + (int)(round_trip * 2000 * 0.9);
            } else {
                total = (ticket * 1000) + (int)(round_trip * 2000 * 0.9);
            }



            System.out.println("Total tickets: " + ticket + " Round-trip: " + round_trip + " Total: " + total);
        }


}
