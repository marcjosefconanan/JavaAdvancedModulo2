//Creare una classe Fruit che accenti nel costruttore il parametro name (String)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un LinkedList con elementi e stamparlo in console.
//Aggiungere un elemento al primo posto della lista e uno all'ultimo
//Stampare la collezione aggiornata
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Fruit> fruits = new LinkedList<>(Arrays.asList(
                new Fruit("Orange"), new Fruit("Banana"),
                new Fruit("Apple"), new Fruit("Strawberry")
        ));

        System.out.println("LinkedList");
        for(Fruit fruit : fruits) {
            System.out.println(fruit.getName());
        }
        System.out.println();

        fruits.addFirst(new Fruit("Peach"));
        fruits.addLast(new Fruit("Pomegranate"));

        System.out.println("LinkedList addFirst and addLast");
        for(Fruit fruit : fruits) {
            System.out.println(fruit.getName());
        }
    }
}
