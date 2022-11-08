package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (features= {"src/test/resources/login/login.feature"},glue= {"defination"}, tags = "@NegativeTesting", plugin = {"html:testoutput/cucumber_guru_casestudy.html"})
public class Test_Runner {

}
