package com.manish.example.compose.androidunittestingdemo.helper

import android.util.Log
import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class DemoUtilsTest {

    @Test
    fun isStringValid() {
        val helper = DemoUtils()
        val result = helper.isStringValid("mk")
        assertEquals(true, result)

    }

    @Before
    fun setUp() {
        Log.d("Manish", "setUp: ")
    }

    @After
    fun tearDown() {
        Log.d("Manish", "tearDown: ")
    }

    @Test
    fun isPalindrome() {
        val helper = DemoUtils()
        val result = helper.isPalindrome("")
        assertEquals(true, result)
    }
}