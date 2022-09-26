package spring;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.repositories.PeopleRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional (readOnly = true)

public class PeopleService {

    private PeopleRepository peopleRepository;
    @Autowired
    public PeopleService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }


    public List<Person> show_all () {
       return peopleRepository.findAll();
    }
    public Person findone (int id) {
        Optional<Person> foundPerson = peopleRepository.findById(id);
        return foundPerson.orElse(null);  }


    public List<Book> getBooksByPersonId (int id) {
        Optional<Person> foundPerson = peopleRepository.findById(id);
       if (foundPerson.isPresent()) {
           Hibernate.initialize(foundPerson.get().getBooks());
       }
       return foundPerson.get().getBooks();
    }

@Transactional
    public void save(Person person) {
        peopleRepository.save(person);
    }
    @Transactional
    public void update(int id, Person updatedperson) {
      Optional<Person> person = peopleRepository.findById(id);

      person.get().setBirth_year(updatedperson.getBirth_year());
      person.get().setFirst_name(updatedperson.getFirst_name());
      person.get().setSurname(updatedperson.getSurname());
      person.get().setPatronymic(updatedperson.getPatronymic());

    }

@Transactional
    public void delete(int id) {
        peopleRepository.deleteById(id);
}
}
