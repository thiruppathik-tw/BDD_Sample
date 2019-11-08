package com.thiru.bddsample.test;

import android.app.Instrumentation;

import androidx.test.espresso.Espresso;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;

import com.thiru.bddsample.MainActivity;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

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
