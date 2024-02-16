import java.time.LocalDate;

public class Teacher extends Person{

    String degree;
    Subject teachingSubject;
    String supervisingClass;


    public Teacher(int id, String name, String surname, String birthDate, String cllassification, String degree, Subject teachingSubject, String supervisingClass) {
        super(id, name, surname, LocalDate.parse(birthDate), cllassification);
        this.degree = degree;
        this.teachingSubject = teachingSubject;
        this.supervisingClass = supervisingClass;
    }
}
