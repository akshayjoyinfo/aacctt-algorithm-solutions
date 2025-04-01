package org.aacctt.solutions

class ParkingDilemma {
    fun carParkingRoof(cars: IntArray, k: Int): Int {
        if (cars.isEmpty() || k <= 0) return 0

        cars.sort()

        var minLength = Int.MAX_VALUE
        
        for (i in 0..cars.size - k) {
            val currentLength = cars[i + k - 1] - cars[i] + 1
            minLength = minOf(minLength, currentLength)
        }

        return minLength
    }
}