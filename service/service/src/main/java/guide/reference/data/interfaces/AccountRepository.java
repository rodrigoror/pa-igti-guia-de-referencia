package guide.reference.data.interfaces;

import java.util.UUID;

import guide.reference.domain.Account;
import guide.reference.domain.CreateAccountDTO;

public interface AccountRepository {
    Account findById(UUID uuid);
    Account findByDocument(Long document);
    Account create(CreateAccountDTO accountDTO);
}
