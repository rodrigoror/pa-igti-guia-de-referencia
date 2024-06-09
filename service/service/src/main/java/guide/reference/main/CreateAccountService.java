package guide.reference.main;

import guide.reference.data.interfaces.AccountRepository;
import guide.reference.data.usecases.CreateAccountImpl;
import guide.reference.domain.Account;
import guide.reference.domain.CreateAccount;
import guide.reference.domain.CreateAccountDTO;
import guide.reference.infra.panache.PanacheAccountRepository;
import jakarta.inject.Singleton;
import jakarta.transaction.Transactional;

@Singleton
public class CreateAccountService {
    CreateAccount createAccount;

    public CreateAccountService(){
        AccountRepository ar = new PanacheAccountRepository();
        this.createAccount = new CreateAccountImpl(ar);
    }

    @Transactional
    public Account handle(CreateAccountDTO createAccountDTO){
        return this.createAccount.create(createAccountDTO);
    }
}
