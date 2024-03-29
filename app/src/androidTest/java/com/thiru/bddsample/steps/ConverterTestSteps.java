package com.thiru.bddsample.steps;

import androidx.test.rule.ActivityTestRule;

import com.thiru.bddsample.MainActivity;
import com.thiru.bddsample.test.ConverterTest;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ConverterTestSteps {
    private ConverterTest converterTest = new ConverterTest();

    private ActivityTestRule activityRule = new ActivityTestRule(MainActivity.class, false, true);

    @Before
    public void setup() {
        converterTest.launchConverterActivity(activityRule);
    }

    @Given("^I have a Converter Activity")
    public void startMainActivity() {
//        Instrumentation instrumentation = InstrumentationRegistry.getInstrumentation();
//        Espresso.setFailureHandler(new CustomFailureHandler(instrumentation, activityRule));
    }

    @When("^I input decimal in decimal field (\\S+)$")
    public void inputDecimal(String decimal) {
       converterTest.enterDecimal(decimal);
    }

    @And("^I select Convert button")
    public void clickConvertButton() {
        converterTest.closeKeyboard();
        converterTest.selectConvertButton();
    }

    @Then("^I should get the equivalent roman number (\\S+)$")
    public void shouldGetRoman(String roman) {
        converterTest.isValidConversion(roman);
    }

    @After
    public void finish() {
        converterTest.finishConverterActivity(activityRule);
    }
}
