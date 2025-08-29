//package steps;
//
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.Scenario;
//import utils.CommonMethods;
//
//public class Hooks extends CommonMethods {
//    @Before
//    public void start() {
//        openBrowserAndLaunchApplication();
//    }
//
//
//    @After
//    public void end(Scenario scenario) {
//        //Scenario class in cucumber framework has all the detail about the execution such as testcase name, status and so on
//
//        byte[] pic;
//
//        //This line will generate the screenshot with the name and data pattern
//        if (scenario.isFailed()) {
//            pic = takeScreenshot("failed/" + scenario.getName());
//        } else {
//            pic = takeScreenshot("passed/" + scenario.getName());
//        }
//
//        //This line will attach the screenshot for the report
//        scenario.attach(pic, "image/png", scenario.getName());
//        closeBrowser();
//    }
//}


package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.CommonMethods;

public class Hooks extends CommonMethods {

    @Before
    public void start(Scenario scenario) {
        System.out.println("Starting scenario: " + scenario.getName());
        openBrowserAndLaunchApplication();
    }

    @After
    public void end(Scenario scenario) {
        byte[] screenshot;

        if (scenario.isFailed()) {
            screenshot = takeScreenshot("failed/" + scenario.getName());
        } else {
            screenshot = takeScreenshot("passed/" + scenario.getName());
        }

        scenario.attach(screenshot, "image/png", scenario.getName());

       // closeBrowser();
    }
}