package spring;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@org.springframework.stereotype.Controller
@RequestMapping("/people")
public class Controller {

    private final PeopleService peopleService;
    private final BookService bookService;
    @Autowired
    public Controller(PeopleService peopleService, BookService bookService) {

        this.peopleService = peopleService;
        this.bookService = bookService;
    }


    /*
    Realisation of Person
     */

    @GetMapping
    public String index(Model model) {
        model.addAttribute("people", peopleService.show_all() );
        return "index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id,
                       Model model) {
        model.addAttribute("person" ,peopleService.findone(id));
        model.addAttribute("show", peopleService.getBooksByPersonId(id));
        return "show";
    }

    @GetMapping("/new")
    public String create(Model model) {
        model.addAttribute("person" , new Person());


        return "new";
    }

    @PostMapping
    public String save(@ModelAttribute ("person") Person person) {
        peopleService.save(person);



        return "redirect:/people";
    }

    @GetMapping("/{id}/edit")
    public String update_person(@PathVariable ("id") int id,
                                Model model) {
        model.addAttribute("person" , peopleService.findone(id) );
        return "edit";
    }
    @PatchMapping("/{id}")
    public String update(@PathVariable ("id") int id,
                         @ModelAttribute ("person") Person updatedperson) {
       peopleService.update(updatedperson.getId(), updatedperson);
        return "redirect:/people";
    }


    @DeleteMapping("/{id}")
    public String delete(@PathVariable ("id") int id,
                       @ModelAttribute ("person") Person person) {
        peopleService.delete(id);
        return "redirect:/people";

    }


 /*
    Realisation of Book
     */

    @GetMapping("/book")
    public String index_book(@RequestParam (value = "page" , required = false) Integer page ,
                             @RequestParam (value = "books_per_page", required = false) Integer books_per_page,
                             @RequestParam (value = "sort_by_year", required = false) boolean sort,
                             Model model) {

        if (page == null || books_per_page == null) {
        model.addAttribute("books", bookService.show_all() ); }
        else   { model.addAttribute("books", bookService.pagination(page, books_per_page) ); }



        if (sort) { model.addAttribute("books",  bookService.sort()); }
          else    { model.addAttribute("books", bookService.show_all() ); }

        return "book/index";
    }


    @GetMapping("/book/{book_id}")
    public String show_book(@PathVariable("book_id") int id,
                            Model model,
                            @ModelAttribute("person") Person person

                         )  {
        model.addAttribute("books" ,bookService.show(id));
        Person bookowner = bookService.getBookOwner(id);
        System.out.println(bookService.check_date(bookService.show(id)));

        model.addAttribute("check", bookService.check_date(bookService.show(id)));


        if (bookowner != null) {
            model.addAttribute("owner" , bookowner );
        }
        else {
            model.addAttribute("people", peopleService.show_all());}


        return "book/show";
    }

    @GetMapping("/book/new")
    public String create_book(Model model) {
        model.addAttribute("books" , new Book());
        return "book/new";
    }

    @PostMapping("/book")
    public String save_book(@ModelAttribute ("books") Book book) {
        bookService.save(book);
        return "redirect:/people/book";
    }

    @GetMapping("/book/{book_id}/edit")
    public String update_book(@PathVariable ("book_id") int id,
                                Model model) {
        model.addAttribute("book" , bookService.show(id) );
        return "book/edit";
    }
    @PatchMapping("/book/{book_id}")
    public String edit_book(@PathVariable ("book_id") int id,
                         @ModelAttribute ("book") Book updatedbook) {
        bookService.update(updatedbook.getBook_id(),  updatedbook);
        return "redirect:/people/book";
    }

    @DeleteMapping("/book/{book_id}")
    public String delete_book(@PathVariable ("book_id") int id,
                         @ModelAttribute ("book") Person person) {
        bookService.delete(id);
        return "redirect:/people/book";

    }

    @PostMapping("/book/add/{id}")
    public String add_book( @PathVariable ("id") int id,  @ModelAttribute("person") Person person

                            ) {
        bookService.add(id, person);

        return "redirect:/people/book";
    }

    @PatchMapping("/book/free/{book_id}")
    public String free( @PathVariable ("book_id") int id


    ) {
        bookService.free(id);


        return "redirect:/people/book";
    }

    @GetMapping("/book/search")
    public String search() {

        return "book/search";
    }


    @PostMapping("/book/search")
    public String search_book( Model model, @RequestParam("title") String title) {

       model.addAttribute("book" ,  bookService.search(title));

        return "book/search";
    }









}
