package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadPoolExecutor;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Lion");
        animals.add("Tiger");
        Collections.addAll(animals,"Horse","Goat");
        System.out.println(animals);
        Collections.sort(animals);
        //ascending order
        System.out.println("Sort "+animals);
        //reverse order
        Collections.sort(animals,Collections.reverseOrder());
        System.out.println("Reverse Order "+animals);
        ArrayList<String> petAnimals = new ArrayList<>();
        ArrayList<String> newAnimals = new ArrayList<>();
        newAnimals.add("");
        newAnimals.add("");
        newAnimals.add("");
        newAnimals.add("");
        petAnimals.add("Cow");
        petAnimals.add("Buffalo");
        petAnimals.add("Dog");
        System.out.println("Disjoint "+Collections.disjoint(animals,petAnimals));
        Collections.copy(newAnimals,petAnimals);
        System.out.println("New "+newAnimals);
        System.out.println("Min element: "+Collections.min(animals));
        System.out.println("Max element: "+Collections.max(animals));
        //Sort newAnimals list
        Collections.sort(newAnimals);
        System.out.println("Sorting new animals"+newAnimals);
        System.out.println("index of cow "+Collections.binarySearch(newAnimals,"Cow"));

        //A=65 = 01010 ASCII codes

    }
}
