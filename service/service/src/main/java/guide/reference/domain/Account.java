package guide.reference.domain;

import java.util.List;
import java.util.UUID;

public class Account {
    public UUID id;
    public String name;
    public Long document;
    public Person person;
    public List<Address> addresses;
    public List<Phone> phones;

}
