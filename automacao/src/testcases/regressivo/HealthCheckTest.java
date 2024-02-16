package regressivo;

import com.hpe.alm.octane.OctaneCucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(OctaneCucumber.class)
@CucumberOptions(plugin = {"junit:junitResult.xml"},
        features = "features/HealthCheck_198014.feature",
        monochrome = true,
        glue = "steps")
public class HealthCheckTest {

}
