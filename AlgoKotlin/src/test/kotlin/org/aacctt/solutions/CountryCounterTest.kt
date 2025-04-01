package org.aacctt.solutions

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountryCounterTest {

    private val countryCounter = CountryCounter()

    @Test
    fun `test case small`() {
        val matrix = arrayOf(
            intArrayOf(1, 1, 0),
            intArrayOf(1, 0, 0),
            intArrayOf(0, 0, 1)
        )
        assertEquals(3, countryCounter.countCountries(matrix))
    }

    @Test
    fun `test just one country`() {
        val matrix = arrayOf(
            intArrayOf(2, 2, 2),
            intArrayOf(2, 2, 2),
            intArrayOf(2, 2, 2)
        )
        assertEquals(1, countryCounter.countCountries(matrix))
    }

    @Test
    fun `test with empty array countries`() {
        val matrix = arrayOf<IntArray>()
        assertEquals(0, countryCounter.countCountries(matrix))
    }

    @Test
    fun `test scenario in the email`() {
        val matrix = arrayOf(
            intArrayOf(5, 4, 4),
            intArrayOf(4, 3, 4),
            intArrayOf(3, 2, 4),
            intArrayOf(2, 2, 2),
            intArrayOf(3, 3, 4),
            intArrayOf(1, 4, 4),
            intArrayOf(4, 1, 1)
        )
        assertEquals(11, countryCounter.countCountries(matrix))
    }

    @Test
    fun `test single element matrix`() {
        val matrix = arrayOf(
            intArrayOf(1)
        )
        assertEquals(1, countryCounter.countCountries(matrix))
    }

    @Test
    fun `test all different elements`() {
        val matrix = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9)
        )
        assertEquals(9, countryCounter.countCountries(matrix))
    }

    @Test
    fun `test large uniform matrix`() {
        val matrix = Array(100) { IntArray(100) { 1 } }
        assertEquals(1, countryCounter.countCountries(matrix))
    }

    @Test
    fun `test checkerboard pattern`() {
        val matrix = arrayOf(
            intArrayOf(1, 0, 1),
            intArrayOf(0, 1, 0),
            intArrayOf(1, 0, 1)
        )
        assertEquals(9, countryCounter.countCountries(matrix))
    }

    @Test
    fun `test vertical stripes`() {
        val matrix = arrayOf(
            intArrayOf(1, 2, 1),
            intArrayOf(1, 2, 1),
            intArrayOf(1, 2, 1)
        )
        assertEquals(3, countryCounter.countCountries(matrix))
    }

    @Test
    fun `test horizontal stripes`() {
        val matrix = arrayOf(
            intArrayOf(1, 1, 1),
            intArrayOf(2, 2, 2),
            intArrayOf(1, 1, 1)
        )
        assertEquals(3, countryCounter.countCountries(matrix))
    }
}