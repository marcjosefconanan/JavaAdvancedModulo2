//Creare una classe Student che accenti nel costruttore il parametro name (String) e age (Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con n elementi e stamparlo in console.
//Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>(Arrays.asList(
                // ho fatto il array list qui per riuscirlo a chimare sul for loop.
                new Student("Leonardo", 15),
                new Student("Donatello", 16),
                new Student("Raphael", 17),
                new Student("Michelangelo", 18)));

        System.out.println("Initial ArrayList:");

        for (int i = 0; i < students.size(); i++) {   // for (Student student : students) {
            Student student = students.get(i);        // System.out.println(student);
            System.out.println(student);
        }
        System.out.println(); // per mettere lo spazio

        students.add(new Student("Ricca", 28));
        students.add(new Student("Roby", 19));
        students.add(new Student("Denise", 18));
        students.add(new Student("Antonino", 22));

        System.out.println("ArrayList after adding 4 elements:");

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println(student);
        }
    }
}