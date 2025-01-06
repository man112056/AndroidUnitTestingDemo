package com.manish.example.compose.androidunittestingdemo.views

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.manish.example.compose.androidunittestingdemo.R
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class ViewBasedActivityTest {

    // this line ensures that this file is for ViewBasedActivity class and will open / launch that activity.
    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(ViewBasedActivity::class.java)

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun buttonClickActionTest() {
        onView(withId(R.id.testBtn)).perform(click())
//        onView(withId(R.id.testBtn)).perform(typeText("this is for edittext input")) // typeText is for input field EditText
        onView(withId(R.id.tvId)).check(matches(withText("Button is clicked")))
    }
}