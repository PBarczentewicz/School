import java.time.LocalDate;

public class Person {
    int id;
    String name;
    String surname;
    LocalDate birthDate;


    public Person (int id, String name, String surname, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

}


