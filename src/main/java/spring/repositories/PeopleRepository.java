package spring.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.Person;


@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
}
