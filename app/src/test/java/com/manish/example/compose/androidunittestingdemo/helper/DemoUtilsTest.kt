package com.manish.example.compose.androidunittestingdemo.helper

import junit.framework.TestCase.assertEquals
import org.junit.Test

class DemoUtilsTest {

    @Test
    fun isStringValid() {
        val helper = DemoUtils()
        val result = helper.isStringValid("mk")
        assertEquals(true, result)

    }
}