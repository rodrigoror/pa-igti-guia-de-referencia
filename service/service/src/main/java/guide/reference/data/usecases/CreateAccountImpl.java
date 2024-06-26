package guide.reference.data.usecases;

import guide.reference.data.interfaces.AccountRepository;
import guide.reference.domain.Account;
import guide.reference.domain.CreateAccount;
import guide.reference.domain.CreateAccountDTO;
import jakarta.transaction.Transactional;

public class CreateAccountImpl implements CreateAccount {

    private AccountRepository accountRepository;
    
    public CreateAccountImpl(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }
    
    @Override
    @Transactional
    public Account create(CreateAccountDTO accountDTO) {
        validateAccount(accountDTO);
        return this.accountRepository.create(accountDTO);
    }


    private void validateAccount(CreateAccountDTO accountDTO) {
       Account account = this.accountRepository.findByDocument(accountDTO.document);
       if(account != null) {
        throw new RuntimeException("Duplicated Document");
       }
    }
    
    
}
