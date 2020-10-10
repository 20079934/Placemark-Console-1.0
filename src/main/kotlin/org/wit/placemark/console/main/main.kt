package org.wit.placemark.console.main

import mu.KotlinLogging

private val logger = KotlinLogging.logger {}

fun menu() : Int {
    var option : Int;
    var input : String? = null;

    println("Main Menu");
    println(" 1. Add Placemark");
    println(" 2. Update Placemark");
    println(" 3. List All Placemarks");
    println("------------------");
    println(" 0. Exit");
    println();
    print("Enter an option: ");
    input = readLine()!!;
    option = if(input.toIntOrNull() != null && !input.isEmpty())
        input.toInt();
    else
        -9
    return option;
}

fun main(args: Array<String>) {
    logger.info { "Launching Placemark Console App" };
    println("Placemark Kotlin App Version 1.0");

    var input : Int;
    do {
        input = menu();
        when(input) {
            1 -> addPlacemark();
            2 -> updatePlacemark();
            3 -> listAllPlacemarks();
            0 -> println("Exiting App...");
            else -> println("Invalid option");
        }
        println();
    } while (input != 0)
    logger.info { "Shutting Down Placemark Console App" }
}

fun addPlacemark() {
    println("You chose add placemark");
}

fun updatePlacemark() {
    println("You chose update placemark");
}

fun listAllPlacemarks() {
    println("You chose listAllPlacemarks");
}