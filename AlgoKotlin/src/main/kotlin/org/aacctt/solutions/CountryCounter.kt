package org.aacctt.solutions
class CountryCounter {
    fun countCountries(matrix: Array<IntArray>): Int {
        if (matrix.isEmpty() || matrix[0].isEmpty()) return 0

        val rows = matrix.size
        val cols = matrix[0].size

        val visited = Array(rows) { BooleanArray(cols) }
        var countryCount = 0

        val directions = listOf(
            Pair(-1, 0), Pair(1, 0), Pair(0, -1), Pair(0, 1)
        )

        fun bfs(startRow: Int, startCol: Int) {
            val queue = ArrayDeque<Pair<Int, Int>>()
            queue.add(startRow to startCol)
            visited[startRow][startCol] = true
            val countryColor = matrix[startRow][startCol]

            while (queue.isNotEmpty()) {
                val (row, col) = queue.removeFirst()

                for ((dRow, dCol) in directions) {
                    val newRow = row + dRow
                    val newCol = col + dCol

                    if (newRow in 0 until rows && newCol in 0 until cols &&
                        !visited[newRow][newCol] && matrix[newRow][newCol] == countryColor
                    ) {
                        visited[newRow][newCol] = true
                        queue.add(newRow to newCol)
                    }
                }
            }
        }

        for (i in 0 until rows) {
            for (j in 0 until cols) {
                if (!visited[i][j]) {
                    countryCount++
                    bfs(i, j)
                }
            }
        }

        return countryCount
    }
}
