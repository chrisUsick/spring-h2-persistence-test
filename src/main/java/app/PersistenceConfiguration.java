package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.annotation.PostConstruct;

import static java.util.Arrays.asList;

/**
 * Created by chris.usick on 2/24/16.
 */
@Configuration
@EnableJpaRepositories
public class PersistenceConfiguration {

    @Autowired
    private PersonRepository personRepository;

    @PostConstruct
    private void addPersons() {
        Person john = new Person();
        john.setFirstName("John");
        Person mary = new Person();
        mary.setFirstName("Mary");
        personRepository.save(asList(john, mary));
    }
}