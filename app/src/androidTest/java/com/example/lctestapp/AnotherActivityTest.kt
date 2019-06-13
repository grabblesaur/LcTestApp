package com.example.lctestapp

import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test


class AnotherActivityTest {

    @get:Rule
    var anotherActivity = ActivityTestRule(AnotherActivity::class.java)

    @Test
    fun showMainActivityThenGoBack() {
        onView(withId(R.id.showAnotherActivityBtn))
            .perform(click())
        onView(isRoot())
            .perform(ViewActions.pressBack())
    }

}