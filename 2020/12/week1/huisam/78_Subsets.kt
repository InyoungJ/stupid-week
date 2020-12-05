package com.huisam.kotlin.problem

class Solution2 {
    fun subsets(nums: IntArray): List<List<Int>> {
        val answer = mutableListOf<List<Int>>()
        go(nums, 0, mutableListOf(), answer)

        return answer
    }

    private fun go(
        nums: IntArray,
        index: Int,
        current: MutableList<Int>,
        answer: MutableList<List<Int>>
    ) {
        if (index == nums.size) {
            answer.add(current.toList())
            return
        }

        go(nums, index + 1, current, answer)
        current.add(nums[index])
        go(nums, index + 1, current, answer)
        current.removeAt(current.size - 1)
    }
}

fun main() {
    val numbers = intArrayOf(1, 2, 3)
    println(Solution2().subsets(numbers))

}