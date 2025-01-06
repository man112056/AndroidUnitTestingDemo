package com.manish.example.compose.androidunittestingdemo.helper

import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(value = Parameterized::class)
class DemoUtilsParameterized(val input: String, val expectedValue: Boolean) {

    @Test
    fun test() {
        val helper = DemoUtils()
        val result = helper.isPalindrome(input)
        assertEquals(expectedValue, result)
    }

    companion object {

        @JvmStatic
        @Parameterized.Parameters(name = "{index}: {0} is {1}")
        fun data(): List<Array<Any>> {
            return listOf(
                arrayOf("hello", false),
                arrayOf("level", true),
                arrayOf("", true)
            )
        }
    }
}