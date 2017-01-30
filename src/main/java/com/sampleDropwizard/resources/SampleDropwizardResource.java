package sampleDropwizard.resources;

import com.google.common.base.Optional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class SampleDropwizardResource {
    @GET
    public String sayHello(@QueryParam("name") Optional<String> name) {
        return "Hello!!!!!";
    }
}