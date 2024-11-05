package arch.auto.runners.aluma;

import arch.auto.runners.SequentialBaseRunner;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = {"@Sample"},
        features = "classpath:features/Aluma"
        // , dryRun=true
)
public class Aluma extends SequentialBaseRunner {}
