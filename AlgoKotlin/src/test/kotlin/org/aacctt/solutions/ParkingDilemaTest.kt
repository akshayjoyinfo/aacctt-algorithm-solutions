package org.aacctt.solutions


import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ParkingDilemaTest {

    private val parkingDilemma = ParkingDilemma()

    @Test
    fun `test case small`() {
        val cars = intArrayOf(6, 2, 12, 7)
        val k = 3
        assertEquals(6, parkingDilemma.carParkingRoof(cars, k))
    }

    @Test
    fun `test just one car`() {
        val cars = intArrayOf(5)
        val k = 1
        assertEquals(1, parkingDilemma.carParkingRoof(cars, k))
    }

    @Test
    fun `test all cars in a row`() {
        val cars = intArrayOf(1, 2, 3, 4, 5)
        val k = 5
        assertEquals(5, parkingDilemma.carParkingRoof(cars, k))
    }

    @Test
    fun `test with large gaps`() {
        val cars = intArrayOf(1, 10, 20, 30, 40)
        val k = 2
        assertEquals(10, parkingDilemma.carParkingRoof(cars, k))
    }

    @Test
    fun `test minimum roof length`() {
        val cars = intArrayOf(1, 3, 6, 10, 15)
        val k = 3
        assertEquals(6, parkingDilemma.carParkingRoof(cars, k))
    }
}
