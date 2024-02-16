import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class School {

    Student student1 = new Student(3, "Krzysztof", "Jakiś", "2010-03-22", "piłka nożna", "1 B");
    Student student2 = new Student(4, "Jakub", "Pijakowski", "2010-12-12", "matematyka", "3 C");

    ArrayList<Ratings> listaOcen = new ArrayList<>();
    ArrayList<Subject> subjects = new ArrayList<>(
            List.of(new Subject("Język Polski"),
                    new Subject("Matematyka")
            ));
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Teacher> teachers = new ArrayList<>();


    public void addStudent() {
        //teachers.add()
    }

    public void addTeacher(String imie, String nazwisko, String dataUrodzenia, String subject) {
        Subject addSubject = null;
        for (Subject subject1 : subjects) {
            if (subject1.subjectName == subject) {
                addSubject = subject1;
            }
        }
        teachers.add(new Teacher(teachers.size() + 1, imie, nazwisko, dataUrodzenia, addSubject, "1 B"));
    }

    public void addTudent(String imie, String nazwisko, String dataUrodzenia, String zainteresowania, String klasa) {
        students.add(new Student(students.size() + 1, imie, nazwisko, dataUrodzenia, zainteresowania, klasa));
    }

    public void addTeachers() {
        Scanner scan = new Scanner(System.in);
        String warunek;
        do {
            String imie;
            String nazwisko;
            String dataUrodzenia;
            String przedmiot;

            imie = scan.next();
            nazwisko = scan.next();
            dataUrodzenia = scan.next();
            przedmiot = scan.next();

            addTeacher(imie, nazwisko, dataUrodzenia, przedmiot);

            warunek = scan.next();

        } while (!warunek.equals("y"));
    }

    private Teacher getTeacher(String nazwisko) {
        for (Teacher teacher : teachers) {
            if (teacher.surname == nazwisko) return teacher;
        }
        return null;
    }

    private Student getStudent(String nazwisko) {
        for (Student student : students) {
            if (student.surname == nazwisko) return student;
        }
        return null;
    }

    public void addRate(String nazwiskoUcznia, String nazwiskoNauczyciela, int dodawanaOcena) {
        Teacher teacher1 = getTeacher(nazwiskoNauczyciela);
        listaOcen.add(new Ratings(getStudent(nazwiskoUcznia), teacher1.teachingSubject, teacher1, dodawanaOcena));
    }


    public void addRatings() {
    }

    public void printStudentRate(String nazwisko) {
        for (Ratings ratings : listaOcen) {
            if (ratings.students.surname == nazwisko) {
                System.out.println("nazywam się :" + ratings.students.name + " " + ratings.students.surname);
                System.out.println("mam wystawione oceny z przedmiotów: " + ratings.subjects.subjectName + ratings.rate);
                System.out.printf("wystawione przez: " + ratings.teachers.surname);
            }
        }

    }
}


