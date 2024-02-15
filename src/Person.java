import java.time.LocalDate;

public class Person {
    int id;
    String name;
    String surname;
    LocalDate birthDate;
    String cllassification;


    public Person (int id, String name, String surname, String birthDate, String cllassification) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthDate = LocalDate.parse(birthDate);
        this.cllassification = cllassification;
    }

}


