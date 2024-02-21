package mapinterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        Map<Character, String> names = demo.names();
        System.out.println(names);
        Map<Integer, Character> map = demo.nameChar();
        System.out.println(map);
    }
    public Map<Character,String> names(){
        Map<Character,String> names = new HashMap<>();
        names.put('v',"Vishal");
        names.put('y',"Yeshwant");
        names.put('v',"vamsi");
        names.put('r',"random");
        names.put('a',"Akhil");
        Set<Map.Entry<Character, String>> entries = names.entrySet();
        System.out.println("This are entries");
        System.out.println(entries);
        System.out.println("------------- containsKey()---------------");
        boolean key = names.containsKey('r');
        System.out.println(key);
        System.out.println("------------- containsValue()---------------");
        boolean value =names.containsValue("Akhil");
        System.out.println(value);
        System.out.println("------------- keySet()---------------");
        Set<Character> keySet = names.keySet();
        System.out.println(keySet);
        System.out.println("------------- valueSet()---------------");

        return names;
    }
    public Map<Integer,Character> nameChar(){
        Map<Integer,Character> map = new HashMap<>();
        map.put(2,'s');
        return map;
    }

}
