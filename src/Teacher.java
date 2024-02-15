import java.time.LocalDate;

public class Teacher extends Person{

    String degree;
    String teachingSubject;
    String supervisingClass;


    public Teacher(int id, String name, String surname, LocalDate birthDate, String cllassification, String degree, String teachingSubject, String supervisingClass) {
        super(id, name, surname, birthDate, cllassification);
        this.degree = degree;
        this.teachingSubject = teachingSubject;
        this.supervisingClass = supervisingClass;
    }
}
