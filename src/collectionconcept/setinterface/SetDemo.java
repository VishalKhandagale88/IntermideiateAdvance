package collectionconcept.setinterface;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<Integer> integerHashSet = new HashSet<>();
        integerHashSet.add(null);
        integerHashSet.add(null);
        integerHashSet.add(1);
        integerHashSet.add(2);
        integerHashSet.add(4);
        integerHashSet.add(66);
        integerHashSet.add(6);
        integerHashSet.add(8);
        integerHashSet.add(10);
        System.out.println(integerHashSet);

    }
}
