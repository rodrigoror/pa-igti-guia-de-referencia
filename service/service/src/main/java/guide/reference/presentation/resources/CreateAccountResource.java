package guide.reference.presentation.resources;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.jboss.logging.Logger;

import guide.reference.domain.Account;
import guide.reference.domain.CreateAccountDTO;
import guide.reference.main.CreateAccountService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/account")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CreateAccountResource {
    private static final Logger logger = Logger.getLogger(CreateAccountResource.class);
    
    CreateAccountService createAccountService = new CreateAccountService();

    @POST
    public Account handle(@RequestBody CreateAccountDTO createAccountDTO){
        logger.info("CreateAccount handle");
        return this.createAccountService.handle(createAccountDTO);        
    }
}
