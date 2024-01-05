//Creare una classe Student che accetti nel costruttore il parametro name (String e age Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con 12 elementi e stamparlo in console.
//Mettere in ordine la collezione e stampare il risultato
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>(Arrays.asList(
                new Student("Leonardo", 15), new Student("Donatello", 16),
                new Student("Raphael", 17), new Student("Michelangelo", 18),
                new Student("Marc", 20), new Student("Ricca", 23),
                new Student("Antonino", 22), new Student("Denise", 24),
                new Student("Roby", 52 ), new Student("Luca", 17),
                new Student("Marco", 26), new Student("Golum",140)));

        System.out.println("ArrayList not sorted:");
        for (Student student : students) {  // for (int i = 0; i < students.size(); i++) {
            System.out.println(student);    //Student student = students.get(i);
                                            //System.out.println(student);
        }
        System.out.println();

        students.sort(Comparator.comparingInt(Student::getEta));
        System.out.println("Sort by eta");
        for (Student student : students){
            System.out.println(student);
        }
        System.out.println();

        students.sort(Comparator.comparing(Student::getNome));
        System.out.println("Sorted by nome:");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();

    }
}