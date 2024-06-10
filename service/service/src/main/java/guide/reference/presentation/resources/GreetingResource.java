package guide.reference.presentation.resources;

import org.jboss.logging.Logger;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/ok")
public class GreetingResource {
    private static final Logger logger = Logger.getLogger(GreetingResource.class);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public IsOk isOk() {
        IsOk ok = new IsOk();
        logger.info(ok.getMessage());
        return ok;
    }
    public class IsOk { 
        private final String message;
        public IsOk() {
            logger.info("Generated OK message");
            this.message = "System check is ok";
        }
        public String getMessage() {
            return message;
        }
        @Override
        public String toString() {
            return "IsOk [message=" + message + "]";
        }
    } 
}
