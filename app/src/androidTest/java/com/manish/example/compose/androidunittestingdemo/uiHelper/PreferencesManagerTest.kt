package com.manish.example.compose.androidunittestingdemo.uiHelper

import android.content.Context
import android.util.Log
import androidx.test.core.app.ApplicationProvider
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test

class PreferencesManagerTest {

    private lateinit var context: Context
    private lateinit var preferencesManager: PreferencesManager

    @Before
    fun setUp() {
        context = ApplicationProvider.getApplicationContext()
        preferencesManager = PreferencesManager(context)
    }

    @After
    fun tearDown() {
//        Log.d("Manish", "tearDown: get")
    }

    @Test
    fun testSaveAndRetrieveUserName() {
        val userName = "TestUser"
        preferencesManager.saveUserName(userName)
        val retreivedStr = preferencesManager.getUserName()
        assertEquals(userName, retreivedStr)
    }
}