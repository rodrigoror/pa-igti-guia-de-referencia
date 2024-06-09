package guide.reference.infra.panache;

import java.util.UUID;

import guide.reference.domain.Account;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "account")
public class PanacheAccount extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    @Column(name="id")
    public UUID id;

    @Column(name="name")
    public String name;

    @Column(name="document")
    public Long document;

    public Account toAccount(){
        Account account = new Account();
        account.name = this.name;
        account.id = this.id;
        account.document = this.document;
        return account;
    }
    
}
