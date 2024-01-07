//Creare un hashmap, prendere tutti i valori, ordinarli e stamparli
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //creo un hashmap per i elementi che voglio

        //average Animal weights
        HashMap<String, Double> animalWeights = new HashMap<>();
        animalWeights.put("dog", 25.4);
        animalWeights.put("cat", 15.5);
        animalWeights.put("mouse", 100.5);
        animalWeights.put("lion", 340.8);
        animalWeights.put("whale", 12360.030);
        animalWeights.put("zebra", 230.011);
        animalWeights.put("salmon", 70.0067);
        animalWeights.put("tuna", 90.9994);

        System.out.println("HashMap:");
        //faccio un for loop per stampare il hashmap
        for(Map.Entry<String,Double> animal : animalWeights.entrySet()) {
            System.out.println(animal.getKey() + " = " + animal.getValue() + "[KG]");
        }
        System.out.println();

        ArrayList<Map.Entry<String,Double>> animalWeightsList = new ArrayList<>(animalWeights.entrySet());

        // questo compara i elemneti dentro l'hasmap e li mette in ordine alfabetico
        animalWeightsList.sort(Comparator.comparing(Map.Entry::getKey));
        System.out.println("Alphabetical order ArrayList");
        for(Map.Entry<String,Double> animal : animalWeightsList) {
            System.out.println(animal.getKey() + " = " + animal.getValue()+ "[KG]");
        }


        System.out.println();
        // questo compara i elementi e li mette in ordine di peso
        animalWeightsList.sort(Comparator.comparing(Map.Entry::getValue));
        System.out.println("ArrayList ordered by weight");
        for(Map.Entry<String,Double> animal : animalWeightsList) {
            System.out.println(animal.getKey() + " = " + animal.getValue()+ "[KG]");
        }
        //--------------------------------------------------
        // creato unaltro hasmap ma un likedhasMap che lika lashamap al'altro hasmap su.
        System.out.println("LinkedHashMap:");
        LinkedHashMap<String, Double> animalslifespan = new LinkedHashMap<String,Double>();
        animalslifespan.put("dog", 12.2);
        animalslifespan.put("cat",15.3);
        animalslifespan.put("whale", 78.5);
        animalslifespan.put("chicken", 7.3);
        animalslifespan.put("buffalo", 25.8);
        animalslifespan.put("lion", 15.5);
        animalslifespan.put("hippo", 46.7);
        animalslifespan.put("eel", 15.3);
        animalslifespan.put("zebra", 23.5);
        animalslifespan.put("rabbit", 6.3);
        animalslifespan.put("ant", 0.50);

        System.out.println();
        // questo stampa lelenco dei animali e le loro lifespan in un ordine non ordinato.
        System.out.println("Animals life span unordered");
        for ( Map.Entry<String,Double> animal : animalslifespan.entrySet()) {
            System.out.println(animal.getKey() + " = " + animal.getValue() + " [years]");
        }

        //questo stampa l'elenco dei animali in ordine alfabetico.
        System.out.println("Animals life span in alphabetically oredered by a TreeMap");
        TreeMap<String,Double> animalslifespanTree = new TreeMap<>(animalslifespan);
        System.out.println();
        for(Map.Entry<String,Double> animal : animalslifespanTree.entrySet()) {
            System.out.println(animal.getKey() + " = " + animal.getValue() + " [years]");
        }
    }
}