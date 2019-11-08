package com.thiru.bddsample.test;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.rule.ActivityTestRule;

import com.thiru.bddsample.MainActivity;
import com.thiru.bddsample.R;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class ConverterTest {
    public void launchConverterActivity(ActivityTestRule<MainActivity> testRule) {
        testRule.launchActivity(null);
    }

    public void finishConverterActivity(ActivityTestRule<MainActivity> testRule) {
        testRule.finishActivity();
    }

    public void selectDecimalField() {
        onView(withId(R.id.etDecimal)).perform(click());
    }

    public void enterDecimal(String decimal) {
        onView(ViewMatchers.withId(com.thiru.bddsample.R.id.etDecimal)).perform(typeText(decimal));
    }

    public void closeKeyboard() {
        Espresso.closeSoftKeyboard();
    }

    public void selectConvertButton() {
        onView(ViewMatchers.withId(com.thiru.bddsample.R.id.btnConvert)).perform(click());
    }

    public void isValidConversion(String roman) {
        onView(ViewMatchers.withId(R.id.etRoman)).check(matches(withText(roman)));
    }
}
