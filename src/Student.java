import java.time.LocalDate;

public class Student extends Person {

    String studentInterests;
    String clas;


    public Student(int id, String name, String surname, LocalDate birthDate, String cllassification, String studentInterests, String clas) {
        super(id, name, surname, birthDate, cllassification);
        this.studentInterests = studentInterests;
        this.clas = clas;
    }
}
