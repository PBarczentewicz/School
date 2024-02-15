import java.time.LocalDate;
import java.util.ArrayList;

public class School {


    Subject polischLanguage = new Subject("Język Polski");


    Teacher Teacher1 = new Teacher(1, "Anna", "Bzowska", "1982-01-01", "Teacher", "Nauczyciel", polischLanguage, "1 B");

    Student student1 = new Student(3, "Krzysztof", "Jakiś", "2010-03-22", "Student", "piłka nożna", "1B");

    ArrayList<Ratings> ratings = new ArrayList<>();

}
