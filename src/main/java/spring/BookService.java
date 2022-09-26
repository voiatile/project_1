package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.repositories.BookRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class BookService {


   private BookRepository bookRepository;
    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }



    public List<Book> show_all () {
        return bookRepository.findAll();
    }

    public Book show (int id) {
        List<Book> books = bookRepository.findAll();
        Book book =  books.stream().filter( (s)-> (id == s.getBook_id())).findAny().orElse(null);
        return book;


    }

    public Person getBookOwner(int id) {

     Person person = bookRepository.findById(id).get().getOwner();
        return person;

    }
    @Transactional
    public void save(Book book) {

        bookRepository.save(book);
    }
    @Transactional
    public void update(int id, Book updatedbook) {
        List<Book> books = bookRepository.findAll();
        books.stream().filter( (s)-> (id == s.getBook_id())).findAny().orElse(null).setAuthor(updatedbook.getAuthor());
        books.stream().filter( (s)-> (id == s.getBook_id())).findAny().orElse(null).setTitle(updatedbook.getTitle());
        books.stream().filter( (s)-> (id == s.getBook_id())).findAny().orElse(null).setYear(updatedbook.getYear());
    }
    @Transactional
    public void delete (int id) {
     bookRepository.deleteById(id);
    }


    @Transactional
    public void add(int id, Person person) {
        List<Book> books = bookRepository.findAll();
        Optional<Book> book =  books.stream().filter( (s)-> (id == s.getBook_id())).findAny();
        book.get().setOwner(person);
        book.get().setCreated_at(new Date());

    }


    @Transactional
    public void free (int id) {
        List<Book> books = bookRepository.findAll();
        Optional<Book> book =  books.stream().filter( (s)-> (id == s.getBook_id())).findAny();
        book.get().free(id);
    }

    public List<Book> pagination (int page, int itemsPerPage) {
       return bookRepository.findAll(PageRequest.of(page, itemsPerPage)).getContent();
    }

    public List<Book> sort () {
        return bookRepository.findAll(Sort.by("year"));
    }

    public List<Book> search (String title) {

        return bookRepository.findByTitleStartingWith(title);
    }

    public boolean check_date (Book book) {
        Date date = new Date(86400000);
        Long date3 = book.getCreated_at().getTime();
        Long check = (date3 - new Date().getTime());
        return check<date.getTime();


    }


}
