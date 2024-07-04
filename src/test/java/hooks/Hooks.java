package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import static Utilities.Driver.*;

public class Hooks {
    @Before
    public void startUp() throws InterruptedException {
        Base.initialize();
        Thread.sleep(5000);
    }
    @After
    public void tearDown(Scenario scenario) {
        final byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png", "screenshots");
        }
        quitDriver();
    }
}
