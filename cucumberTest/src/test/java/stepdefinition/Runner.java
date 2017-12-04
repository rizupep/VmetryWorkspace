package stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions (tags={"@HomePage"},format={"pretty" , "html:report"})
public class Runner {
  
}
