package com.example.nakata.toshihiro.uitestsample

import android.widget.TextView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.runner.RunWith


import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import org.junit.Test


@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityTest {

    @get:Rule
    var activityRule: ActivityTestRule<MainActivity>
            = ActivityTestRule(MainActivity::class.java)


    @Test
    fun btnClickTest() {
        onView(withId(R.id.btn)).perform(click())

//        onView(withId(R.id.text)).check(object: ViewAssertion{
//            override fun check(view: View?, noViewFoundException: NoMatchingViewException?) {
//                val text = view as TextView
//                assert(text.text == "クリックされました。")
//            }
//        })

//        onView(withId(R.id.text)).check { view, _ ->
//            val text = view as TextView
//            assert(text.text == "クリックされました。")
//        }

        onView(withId(R.id.text)).check(matches(withText("クリックされました。")))
    }
}