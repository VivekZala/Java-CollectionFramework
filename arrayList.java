package JavaCollectionFramework;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;  

public class arrayList {

    public static void main(String ...args) {

        List<Integer> list = new ArrayList<>();

        // Adding an element in the list.
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);

        list.add(50); // This will add at the end of list.
        System.out.println(list);

        list.add(1, 60); // This will add at index 1.
        System.out.println(list);

        List<Integer> newList = new ArrayList<>();

        newList.add(100);
        newList.add(200);

        list.addAll(newList); // This add full list to new list.
        System.out.println(newList);
        System.out.println(list);


        // Reading element from the list.
        System.out.println(list.get(1));

        // Removing an element from the list.
        list.remove(1); // This will remove the element at index 1.
        System.out.println(list); 

        list.remove(Integer.valueOf(30)); // This will delete element 30.
        System.out.println(list);

        // Clearing full list.
        list.clear();
        System.out.println(list);

        // To update the value of an element.
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.set(1, 1000); // This will update 20 to 1000
        System.out.println(list);

        // To check whether it contain an element or not.
        System.out.println(list.contains(50));
        System.out.println();

        /* 
         *  Traversing an list.
         */

        // Using for loop.
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Using forEach
        for (Integer element : list) {
            System.out.println(element);
        }

        // Using Iterator.
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
/*
 *  Time Complexity:
 *  
 *  Adding an element in middle --- O(n)
 *  Removing an element from middle --- O(n)
 *  Setting an element --- O(1)
 */