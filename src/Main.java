//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        School spNr1 = new School();

        spNr1.addTeacher("Jan", "Jan", "2020-02-02", "Matematyka");
        spNr1.addTeacher("Krzyś", "Tarko", "2020-02-02", "Język Polski");

        spNr1.addTudent("Anna", "Piotrowska", "2222-05-06", "ruchanie", "1C");
        spNr1.addTudent("Frańciszka", "Morwa", "2222-05-06", "ruchanie", "1C");

        spNr1.addRate("Piotrowska", "Jan", 5);
        spNr1.addRate("Piotrowska", "Tarko", 5);

        spNr1.printStudentRate("Piotrowska");
    }
}

