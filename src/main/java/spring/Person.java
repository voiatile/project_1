package spring;

public class Person {
    private int id;
    private String first_name;
    private String surname;
    private String patronymic;

    private int birth_year;

    public Person() {

    }

    public Person(String first_name, String surname, String patronymic, int birth_year) {
        this.first_name = first_name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birth_year = birth_year;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(int birth_year) {
        this.birth_year = birth_year;
    }
}
