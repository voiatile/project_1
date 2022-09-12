package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonDAO {


    private final JdbcTemplate jdbcTemplate;
    @Autowired
    public PersonDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<Person> show_all () {
        String sql = "SELECT * FROM person";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper(Person.class));
    }

    public Person show(int id) {
        String sql = "SELECT * FROM person WHERE id=?";
        return jdbcTemplate.query(sql, new Object[]{id}, new BeanPropertyRowMapper<>(Person.class)).stream().findAny().orElse(null);
    }


    public void save(Person person) {
        String sql = "INSERT INTO person(first_name, surname, patronymic, birth_year) Values(?,?,?,?)";
        jdbcTemplate.update(sql, person.getFirst_name(), person.getSurname(),person.getPatronymic(),person.getBirth_year());
    }
    public void update(int id , Person person) {
        String sql = "UPDATE person SET first_name=?, surname=?, patronymic=?, birth_year=? WHERE id=?";
        jdbcTemplate.update(sql, person.getFirst_name(), person.getSurname(),person.getPatronymic(),person.getBirth_year() , id);
    }

    public void delete(int id) {
        String sql = "DELETE FROM person WHERE id=?";
        jdbcTemplate.update(sql,  id);
    }

    public List<Book> check(int id) {
        String sql = "SELECT * FROM book WHERE id=?";
        return jdbcTemplate.query(sql, new Object[]{id}, new BeanPropertyRowMapper<>(Book.class));
    }

}
