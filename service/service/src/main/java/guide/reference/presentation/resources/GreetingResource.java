package guide.reference.presentation.resources;

import org.jboss.logging.Logger;

import io.sentry.Sentry;
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

    /* Inner Class
     * é uma classe criada apenas para um uso especifico e dentro de outra classe. 
     * é desrecommendada em todas as literaturas, entretanto, muito usada no dia-a-dia
     */
    public class IsOk { 
        private final String message;
        public IsOk() {
            String messageOk = "System check is ok"; 
            Sentry.init("https://56c9bb57682cec8701bb485cf7a96b2f@o307334.ingest.us.sentry.io/4507483079049216");
            Sentry.captureException(new RuntimeException(messageOk + " Forced exception"));
            Sentry.pushScope();
            logger.info(messageOk);
            this.message = messageOk;
        }
        public String getMessage() {
            return message;
        }
        @Override
        public String toString() {
            return "IsOk [message=" + this.message + "]";
        }
    } 
}
