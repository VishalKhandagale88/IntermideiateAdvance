package collectionconcept;

import java.util.LinkedList;
import java.util.Stack;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.add(10);
        integerLinkedList.add(50);
        integerLinkedList.addFirst(100);
        Integer element = integerLinkedList.element();  // head element
//        System.out.println(element);
//        System.out.println(integerLinkedList);


        Stack stack = new Stack<>();
        stack.push("vishal");
        stack.push("Yeshwant");
        stack.push("akhil");

        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        

    }
}
