package org.aacctt.solutions

/**
 * This is main class to run high load  with TestCaseGenerator
 * comment whenever you run things in parallel
 */
fun main() {
    val largeMatrix = TestCaseGenerator.generateMatrixCountryLargeTestCase()
    val countryCounter = CountryCounter()
    println("Maximum Country possible: ${countryCounter.countCountries(largeMatrix)}")

    // Example: Generate a test case with n = 10, k = 5
    val (cars, k) = TestCaseGenerator.generateCarRoofLargeTestCase(10000, 1000)
    val parkingDilemma = ParkingDilemma()
    // Run the solution with the generated test case
    val minLength = parkingDilemma.carParkingRoof(cars, k)
    println("Minimum roof length: $minLength")
}