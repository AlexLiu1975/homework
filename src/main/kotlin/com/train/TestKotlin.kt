package com.train

import java.util.*
import kotlin.math.round
import kotlin.math.roundToInt

fun main() {
    val scanner = Scanner(System.`in`)

    print("Please enter number of tickets: ")
    var tickets = scanner.nextInt()

    print("How many round-trip tickets: ")
    var round_trip = scanner.nextInt()

    val t = ticket(tickets, round_trip)
    t.getTickets()

}

class ticket(var tickets: Int, var round_trip: Int) {
    fun getTickets()  {
        var total: Int  = 0

        if (tickets >= round_trip) {
            total = (((tickets-round_trip) * 1000) + (round_trip * 2000 * 0.9).roundToInt())
        } else {
            total = ((tickets * 1000) + (round_trip * 2000 * 0.9).roundToInt())
        }


        println("Total tickets: " + tickets + " Round-trip: " + round_trip + " Total: " + total)

    }
}