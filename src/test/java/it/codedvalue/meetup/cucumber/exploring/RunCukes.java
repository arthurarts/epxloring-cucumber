package it.codedvalue.meetup.cucumber.exploring;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * @author Arthur Arts
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features",  glue = {"it.codedvalue.meetup.cucumber.exploring.cameracollection.stepdefinitions"})
public class RunCukes {



}
