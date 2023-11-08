package qa.runners;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.annotations.*;
import utilities.*;

@CucumberOptions(
		features = "src/test/resources/featureFiles",
		plugin = { "pretty", "html:target/Android/cucumber-reports.html" },
		glue = "qa.steps",
		dryRun = false,
		monochrome = true
)
public class TestNGRunnerTest {

private static CapabilityManager capabilityManager;
private static AppiumDriverManger driverManger=new AppiumDriverManger();
private static ServerManager serverManager=new ServerManager();

private static final ThreadLocal <TestNGCucumberRunner> testNGCucumberRunner=new ThreadLocal<>();
private static void setTestNGCucumberRunner(TestNGCucumberRunner testNGCucumberRunner1)
{
	testNGCucumberRunner.set(testNGCucumberRunner1);
}
public static TestNGCucumberRunner getRunner()
{
	return testNGCucumberRunner.get();
}

@BeforeClass
public void setUpClass(){
	 capabilityManager=new CapabilityManager();
	serverManager.initialiseServer();
	serverManager.startServer();
	driverManger.initialiseDriver();
	driverManger.getAppiumDriver();
setTestNGCucumberRunner(new TestNGCucumberRunner(this.getClass()));
}


@DataProvider
public Object[][] scenarios() {
	return getRunner().provideScenarios();
}
@Test(groups = "cucumber", description = "Runs Cucumber Scenarios", dataProvider = "scenarios")
public void scenario(PickleWrapper pickle, FeatureWrapper cucumberFeature) {
	getRunner().runScenario(pickle.getPickle());
}


@AfterClass(alwaysRun = true)
public void tearDownClass() {
	if (driverManger.getAppiumDriver()!=null)
	{
		driverManger.getAppiumDriver().quit();
	}
	if (serverManager.getServer()!=null)
	{
		serverManager.stopServer();
		System.out.println("Server is stopped");
	}
	if (getRunner()!=null){
		getRunner().finish();
	}
}

}
