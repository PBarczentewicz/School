import java.time.LocalDate;
import java.util.ArrayList;

public class School {


    Subject polischLanguage = new Subject("Język Polski");
    Subject mathematics = new Subject("Matematyka");


    Teacher teacher1 = new Teacher(1, "Anna", "Bzowska", "1982-01-01", "Teacher", "Nauczyciel", polischLanguage, "1 B");
    Teacher teacher2 = new Teacher(2, "Karol", "Nijaki", "1976-03-05", "Teacher", "Nauczyciel mianowany", mathematics, "3 A");

    Student student1 = new Student(3, "Krzysztof", "Jakiś", "2010-03-22", "Student", "piłka nożna", "1 B");
    Student student2 = new Student(4, "Jakub", "Pijakowski", "2010-12-12", "uczeń", "matematyka", "3 C");

    ArrayList<Ratings> ratings = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Teacher> teachers = new ArrayList<>();


    public void addStudent() {
        students.add(student1);
        students.add(student2);
    }

    public void addTeacher() {
        teachers.add(teacher1);
        teachers.add(teacher2);
    }

    public void addRatings() {
        ratings.add(new Ratings(student1, polischLanguage, teacher1, 5));
        ratings.add(new Ratings(student1, polischLanguage, teacher1, 4));
    }


    public void printStudentRate(Student student) {
        for (Ratings ratings : ratings) {
            if (ratings.students == student)
                System.out.println("nazywam się :" + student.name + " " + student.surname);
            System.out.println("mam wystawioną ocenę z przedmiotów: " + ratings.subjects + ratings.rate);
        }
        printStudentRate(student1);




        }




    }

}

