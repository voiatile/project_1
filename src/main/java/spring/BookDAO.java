package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BookDAO {
    private final
    JdbcTemplate jdbcTemplate;
    @Autowired
    public BookDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<Book> show_all () {
        String sql = "SELECT * FROM book";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Book.class));
    }

    public void save(Book book) {
        String sql = "INSERT INTO book(title,author,year) Values(?,?,?)";
        jdbcTemplate.update(sql, book.getTitle(),book.getAuthor(), book.getYear() );
    }

    public Book show(int id) {
        String sql = "SELECT * FROM book WHERE book_id=?";
        return jdbcTemplate.query(sql, new Object[]{id}, new BeanPropertyRowMapper<>(Book.class)).stream().findAny().orElse(null);
    }

    public void update(int id , Book book) {
        String sql = "UPDATE book SET title=?, author=?, year=?  WHERE book_id=?";
        jdbcTemplate.update(sql, book.getTitle(),book.getAuthor() , book.getYear(), id);
    }

    public void delete(int id) {
        String sql = "DELETE FROM book WHERE book_id=?";
        jdbcTemplate.update(sql,  id);
    }

    public void add(int id, Person person) {
        String sql = "UPDATE book SET id=?  WHERE book_id=?";
        jdbcTemplate.update(sql, person.getId() , id);
    }

    public Optional<Person> getBookOwner(int id) {
        String sql = "select * from book join person p on book.id = p.id WHERE book_id=?";
        return jdbcTemplate.query(sql, new Object[]{id}, new BeanPropertyRowMapper<>(Person.class)).stream().findAny();
    }
    public void free(int id) {
        String sql = "UPDATE book SET id=null  WHERE book_id=?";
        jdbcTemplate.update(sql,  id);
    }

}

