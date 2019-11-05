package com.thiru.bddsample.test;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import com.thiru.bddsample.MainActivity;
import com.thiru.bddsample.R;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.isClickable;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class ConverterJUnit {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class, false, true );
    private ConverterTest converterTest = new ConverterTest();

    @Before
    public void launchActivity() {
//        converterTest.launchConverterActivity(mainActivityActivityTestRule);
    }

    @Test
    public void shouldConvertToRoman5() {
        converterTest.enterDecimal("5");
        converterTest.selectConvertButton();
        converterTest.isValidConversion("V");
    }

    @Test
    public void shouldConvertToRoman4() {
        converterTest.enterDecimal("4");
        converterTest.selectConvertButton();
        converterTest.isValidConversion("VI");
    }
}
