package sampleDropwizard;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import sampleDropwizard.resources.SampleDropwizardResource;

public class SampleDropwizardApplication extends Application<SampleDropwizardConfiguration> {

    public static void main(final String[] args) throws Exception {
        new SampleDropwizardApplication().run(args);
    }

    @Override
    public String getName() {
        return "SampleDropwizard";
    }

    @Override
    public void initialize(final Bootstrap<SampleDropwizardConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final SampleDropwizardConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
        console.log("Inside run");
    	SampleDropwizardResource sampleDropwizardResource = new SampleDropwizardResource();
    	environment.jersey().register(sampleDropwizardResource);
    }

}
