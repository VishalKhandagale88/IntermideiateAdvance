package collectionconcept.setinterface;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        integerTreeSet.add(1);
        integerTreeSet.add(10);
        integerTreeSet.add(3);
        integerTreeSet.add(2);
        integerTreeSet.add(7);
        integerTreeSet.add(4);
        System.out.println("Ascending order");
        System.out.println(integerTreeSet);
        System.out.println("\nDescending order");
        System.out.println(integerTreeSet.descendingSet());
    }
}
