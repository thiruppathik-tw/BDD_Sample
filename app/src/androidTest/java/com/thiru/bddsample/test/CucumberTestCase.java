package com.thiru.bddsample.test;

import cucumber.api.CucumberOptions;

@CucumberOptions(features = {"features"}, glue = {"com.thiru.bddsample.steps"}, tags = {"@e2e", "@smoke"})
@SuppressWarnings("unused")
public class CucumberTestCase {
}