import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SolutionTest {
    private val solution = Solution()

    @Test
    fun plusOne1() {
        assertArrayEquals(intArrayOf(1), solution.plusOne(intArrayOf()))
    }

    @Test
    fun plusOne2() {
        assertArrayEquals(intArrayOf(9), solution.plusOne(intArrayOf(8)))
    }

    @Test
    fun plusOne3() {
        assertArrayEquals(intArrayOf(1,0), solution.plusOne(intArrayOf(9)))
    }
}