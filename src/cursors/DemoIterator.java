package cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DemoIterator {

    public static void main(String[] args) {
        ArrayList<Integer>  integerArrayList = new ArrayList<>();
        integerArrayList.add(10);
        integerArrayList.add(111);
        integerArrayList.add(1011);
        integerArrayList.add(10000);

//        Iterator<Integer> integerIterator = integerArrayList.iterator();
//
//        while (integerIterator.hasNext()){
//            Integer i = integerIterator.next();
//            if (i==10){
//                integerIterator.remove();
//            }
//            System.out.println(i);
//        }
//        System.out.println(integerArrayList);


        ListIterator<Integer> integerListIterator = integerArrayList.listIterator();
        // forward iteration
        while (integerListIterator.hasNext()){
            Integer i = integerListIterator.next();
            if (i == 10 ){
                integerListIterator.set(9999);

            }
        }
        System.out.println("Forward");
        System.out.println(integerArrayList);

        //back ward iteration
        System.out.println("Back ward iteration");
        while (integerListIterator.hasPrevious()){
            Integer i = integerListIterator.previous();
            System.out.println(i);
        }


    }
}
