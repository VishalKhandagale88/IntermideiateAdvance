package collectionconcept;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList arrayListrrayList = new ArrayList();

        arrayListrrayList.add("Yeshwant");
        arrayListrrayList.add(2);
        arrayListrrayList.add(13.2);
        arrayListrrayList.add('c');
        System.out.println(arrayListrrayList);


        //generics
        ArrayList<String> stringArrayList1 = new ArrayList<>();
        stringArrayList1.add("Aruku");
        stringArrayList1.add("vskp");

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("sdsd");
//        stringArrayList.remove("sdsd");
        stringArrayList.add(0,"Yeshwant Badwa");
//        stringArrayList.remove(0);

        stringArrayList.add("JAVA");
        stringArrayList.add("Yeshwant");


//        stringArrayList.addAll(0,stringArrayList1);

        stringArrayList.addAll(stringArrayList1);
        boolean result = stringArrayList.contains("vishal");
        String string = stringArrayList.get(1);
        System.out.println(string);
        int indexOf = stringArrayList.indexOf("Aruku");


        System.out.println(indexOf);
        System.out.println(stringArrayList);

        stringArrayList.indexOf("vskp"); // takes object and return index
        stringArrayList.get(1); //  takes index and return the object at that index


        ArrayList<Integer> integerArrayList = new ArrayList<>(); // Integer is a wrapper class
        integerArrayList.add(1);
        integerArrayList.add(10);
        System.out.println(integerArrayList);

        ArrayList<Float> floatArrayList = new ArrayList<>();
        floatArrayList.add(10.00f);
        System.out.println(floatArrayList);

        ArrayList<Character> characterArrayList = new ArrayList<>();
        characterArrayList.add('x');
        characterArrayList.add('1');
        characterArrayList.add('0');
        System.out.println(characterArrayList);

        // looping in array list
        for (int i=0;i<stringArrayList.size();i++){
            String s = stringArrayList.get(i);
            if (s.equals("JAVA")){
                System.out.println("Java is present");
            }
            System.out.println(i+"  "+stringArrayList.get(i));
        }


        //forEach loop
        System.out.println("Enhanced for loop");
        int i =0;
        for (String str : stringArrayList){
            System.out.println(i++ +"  "+str);
        }






    }

}
