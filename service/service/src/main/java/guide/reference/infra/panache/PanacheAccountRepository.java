package guide.reference.infra.panache;

import java.util.UUID;

import guide.reference.data.interfaces.AccountRepository;
import guide.reference.domain.Account;
import guide.reference.domain.CreateAccountDTO;
import io.quarkus.panache.common.Parameters;
import jakarta.transaction.Transactional;

public class PanacheAccountRepository implements AccountRepository {

    private static final String HQL_SELECT_BY_DOCUMENT = 
        "SELECT account FROM MySqlAccount where account.document = :document";
        
        
    @Override
    @Transactional
    public Account findByDocument(Long document){
        PanacheAccount account = PanacheAccount.find(HQL_SELECT_BY_DOCUMENT, Parameters.with("document",document)).firstResult();
        return account.toAccount();
    }

    @Override
    public Account findById(UUID uuid) {
        //to be implemented/to be implemented
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    @Transactional
    public Account create(CreateAccountDTO accountDTO) {
        PanacheAccount pAccount = new PanacheAccount();
        pAccount.name = accountDTO.name;
        pAccount.document = accountDTO.document;
        //implement others

        pAccount.persist();
        return pAccount.toAccount();
    }

}
