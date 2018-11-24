package hr.tstrelar.swarmapp.rest;


import org.eclipse.microprofile.metrics.annotation.Counted;
import org.jboss.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Date;


@Path("/hello")
public class HelloWorldEndpoint {

	private static Logger log = Logger.getLogger(HelloWorldEndpoint.class);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Counted(
			name="hello.counter",
			displayName="Number of greetings",
			description = "Greetings that were given using any method",
			monotonic=true,
			reusable=true)
	public Data doGet() {
		log.info("I was invoked, better say hello...");
		return Data.Builder.create()
				.aDouble(5.4)
				.date(new Date())
				.id(43)
				.text("This is THE text")
				.build();
	}
}
