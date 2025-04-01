package org.aacctt.solutions
import kotlin.random.Random
object TestCaseGenerator {
    /**
     *  Generate testcase for 30000x10000 Matrix
     *
     */
    fun generateMatrixCountryLargeTestCase(): Array<IntArray> {
        val rows = 30000
        val cols = 10000
        val matrix = Array(rows) { IntArray(cols) }

        // Define a fixed set of 10 numbers within the specified range
        val fixedNumbers = listOf(
            -1000000000, -900000000, -800000000, -700000000, -600000000,
            0, 100000000, 200000000, 300000000, 400000000
        )

        for (i in 0 until rows) {
            for (j in 0 until cols) {
                // Randomly select from the fixed set of numbers
                matrix[i][j] = fixedNumbers.random()
            }
        }
        return matrix
    }

    fun generateCarRoofLargeTestCase(n: Int, k: Int): Pair<IntArray, Int> {
        // Generate n unique parking spots
        val cars = mutableSetOf<Int>()
        while (cars.size < n) {
            cars.add(Random.nextInt(1, 1_000_000_000))
        }

        // Convert to sorted array
        val carsArray = cars.toIntArray().sortedArray()

        return Pair(carsArray, k)
    }

}