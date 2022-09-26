package spring;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table( name = "book")
public class Book {
    @Id
   @Column(name = "book_id")
   @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int book_id;
    @Column(name = "title")
    private String title;
    @Column(name = "author")
    private String author;
    @Column(name = "year")
    private int year;
    @ManyToOne
    @JoinColumn (name="id" , referencedColumnName = "id")

    private Person owner;


    @Column (name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at;

    @Transient
    private boolean check;

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public void free (int id) {
        this.owner = null;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public String getTitle() {
        return title;
    }

    public Book() {

    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
}

