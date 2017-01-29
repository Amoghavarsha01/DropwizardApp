package sampleDropwizard;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;
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
    	bootstrap.addBundle(new ViewBundle());
    }

    @Override
    public void run(final SampleDropwizardConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    	SampleDropwizardResource sampleDropwizardResource = new SampleDropwizardResource();
    	environment.jersey().register(sampleDropwizardResource);
    }

}
