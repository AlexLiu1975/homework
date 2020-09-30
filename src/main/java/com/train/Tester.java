package com.train;

import java.util.Scanner;

public class Tester {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number of tickets: ");
        int ticket = scanner.nextInt();
        System.out.print("How many round-trip tickets: ");
        int round_trip = scanner.nextInt();

        Tickets ti = new Tickets(ticket, round_trip);
        ti.print();
    }




}
