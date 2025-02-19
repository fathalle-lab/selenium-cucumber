import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.Scenario;

public class Teardown {

	public void quitDriver(Scenario scenario) {

		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) Setup.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "screenshot");

		}
		Setup.getDriver().quit();
		Setup.getLogger().info("Scenario: " + scenario.getName() + "Finished" + scenario.getStatus());

	}

}