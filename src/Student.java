import java.time.LocalDate;

public class Student extends Person {

    String studentInterests;
    String clas;


    public Student(int id, String name, String surname, String birthDate, String studentInterests, String clas) {
        super(id, name, surname, LocalDate.parse(birthDate));
        this.studentInterests = studentInterests;
        this.clas = clas;
    }
}

