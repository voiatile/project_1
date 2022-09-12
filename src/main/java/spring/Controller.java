package spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@org.springframework.stereotype.Controller
@RequestMapping("/people")
public class Controller {
    private final PersonDAO personDAO;
    private final BookDAO bookDAO;
    @Autowired
    public Controller(PersonDAO personDAO,BookDAO bookDAO ) {
        this.personDAO = personDAO;
        this.bookDAO = bookDAO;
    }


    /*
    Realisation of Person
     */

    @GetMapping
    public String index(Model model) {
        model.addAttribute("people", personDAO.show_all() );
        return "index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id,
                       Model model) {
        model.addAttribute("person" ,personDAO.show(id));
        model.addAttribute("show", personDAO.check(id));
        return "show";
    }

    @GetMapping("/new")
    public String create(Model model) {
        model.addAttribute("person" , new Person());

        return "new";
    }

    @PostMapping
    public String save(@ModelAttribute ("person") Person person) {
        personDAO.save(person);
        return "redirect:/people";
    }

    @GetMapping("/{id}/edit")
    public String update_person(@PathVariable ("id") int id,
                                Model model) {
        model.addAttribute("person" , personDAO.show(id) );
        return "edit";
    }
    @PatchMapping("/{id}")
    public String update(@PathVariable ("id") int id,
                         @ModelAttribute ("person") Person updatedperson) {
        personDAO.update(updatedperson.getId(), updatedperson);
        return "redirect:/people";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable ("id") int id,
                       @ModelAttribute ("person") Person person) {
        personDAO.delete(id);
        return "redirect:/people";

    }

    /*
      Realisation of Book
       */
    @GetMapping("/book")
    public String index_book(Model model) {
        model.addAttribute("books", bookDAO.show_all() );
        return "book/index";
    }

    @GetMapping("/book/{book_id}")
    public String show_book(@PathVariable("book_id") int id,
                            Model model,
                            @ModelAttribute("person") Person person

                         ) {
        model.addAttribute("books" ,bookDAO.show(id));
        Optional<Person> bookowner = bookDAO.getBookOwner(id);


        if (bookowner.isPresent()) {
            model.addAttribute("owner" , bookowner.get());
        }
        else {
            model.addAttribute("people", personDAO.show_all());}



        return "book/show";
    }

    @GetMapping("/book/new")
    public String create_book(Model model) {
        model.addAttribute("books" , new Book());
        return "book/new";
    }

    @PostMapping("/book")
    public String save_book(@ModelAttribute ("books") Book book) {
        bookDAO.save(book);
        return "redirect:/people/book";
    }

    @GetMapping("/book/{book_id}/edit")
    public String update_book(@PathVariable ("book_id") int id,
                                Model model) {
        model.addAttribute("book" , bookDAO.show(id) );
        return "book/edit";
    }
    @PatchMapping("/book/{book_id}")
    public String edit_book(@PathVariable ("book_id") int id,
                         @ModelAttribute ("book") Book updatedbook) {
        bookDAO.update(updatedbook.getBook_id(),  updatedbook);
        return "redirect:/people/book";
    }

    @DeleteMapping("/book/{book_id}")
    public String delete_book(@PathVariable ("book_id") int id,
                         @ModelAttribute ("book") Person person) {
        bookDAO.delete(id);
        return "redirect:/people/book";

    }

    @PostMapping("/book/add/{id}")
    public String add_book( @PathVariable ("id") int id,  @ModelAttribute("person") Person person

                            ) {
        bookDAO.add(id, person);

        return "redirect:/people/book";
    }

    @PatchMapping("/book/free/{book_id}")
    public String free( @PathVariable ("book_id") int id


    ) {
        bookDAO.free(id);


        return "redirect:/people/book";
    }

}
