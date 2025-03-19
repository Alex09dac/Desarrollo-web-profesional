package edu.utvt.springboot;

import edu.utvt.springboot.data.entities.Address;
import edu.utvt.springboot.data.repositories.AddressRepository;
import edu.utvt.springboot.data.repositories.AuthorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OneToOneTest {

    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private AuthorRepository authorRepository;

    @Test
    void add(){
        Address address = new Address(null,"El cerrillo Vista Hermosa", "Toluca", this.authorRepository.findAll().getFirst());
        this.addressRepository.save(address);
    }

    @Test
    void delete(){
        Address address = this.addressRepository.findAll().getFirst();
        if(address != null){
            this.addressRepository.delete(address);
        }
    }
}
