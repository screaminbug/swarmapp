package hr.tstrelar.swarmapp.rest;


import org.jboss.logging.Logger;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;


@Path("/hello")
public class HelloWorldEndpoint {

	private static Logger log = Logger.getLogger(HelloWorldEndpoint.class);

	@GET
	@Produces("text/plain")
	public Response doGet() {
		log.info("I was invoked, better say hello...");
		return Response.ok("Hello from Thorntail!").build();
	}
}
