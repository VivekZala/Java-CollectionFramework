package JavaCollectionFramework;

import java.util.Map;
import java.util.HashMap;

public class map {
    
    public static void main(String ...args) {

        Map<String, Integer> numbers = new HashMap<String,Integer>();

        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("two", 22); // This will override

        numbers.putIfAbsent("five", 5);

        System.out.println(numbers);

        for(Map.Entry<String, Integer> e: numbers.entrySet()) {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for(String key: numbers.keySet()) {
            System.out.println(key);
        }

        for(int value: numbers.values()) {
            System.out.println(value);
        }

    }
}
