package hr.tstrelar.swarmapp.rest;


import hr.tstrelar.swarmapp.rest.model.Data;
import hr.tstrelar.swarmapp.rest.model.Sqrt;
import hr.tstrelar.swarmapp.rest.model.Square;
import org.eclipse.microprofile.metrics.annotation.Counted;
import org.jboss.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Date;


@Path("/")
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
	@Path("hello")
	public Data doGet() {
		log.info("I was invoked, better say hello...");
		return Data.Builder.create()
				.aDouble(5.4)
				.date(new Date())
				.id(43)
				.text("This is THE text")
				.build();
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Counted(name="goodbye.counter",
			displayName = "The times a goodbye was said",
		monotonic = true)
	@Path("goodbye")
	public String doGoodbye() {
		log.info("Time to say goodbye");
		return "A Plain goodbye";
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Counted(name="sqrt.counter",
			displayName = "The times a square root was calculated",
			monotonic = true)
	@Path("sqrt/{value}")
	public Sqrt doSqrt(@PathParam("value") Double value) {
		log.info("Calculating square root of " + value);
		return new Sqrt(value);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Counted(name="square.counter",
			displayName = "The times a square of a number was calculated",
			monotonic = true)
	@Path("square/{value}")
	public Square doSquare(@PathParam("value") Double value) {
		log.info("Calculating square root of " + value);
		return new Square(value);
	}
}
