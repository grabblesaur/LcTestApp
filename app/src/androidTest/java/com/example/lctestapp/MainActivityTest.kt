package com.example.lctestapp

import androidx.test.espresso.Espresso.*
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @get:Rule
    var mainActivity = ActivityTestRule(MainActivity::class.java)

    @Test
    fun testSomeShit() {
        onView(withId(R.id.simpleTextView))
            .check(matches(withText("Hello World!")))
    }
}