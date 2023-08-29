package JavaCollectionFramework;
import java.util.HashSet;
import java.util.Set;

public class hashSet {
    
    public static void main(String ...args) {

        // Duplicate elements are not allowed.
        Set<Integer> set = new HashSet<>();

        // Set<Integer> set = new LinkedHashSet(); // Order of insertition is maintained.
        // Set<Integer> set = new TreeSet(); // It will be in sorted form

        set.add(10);
        set.add(12);
        set.add(125);
        set.add(234);

        System.out.println(set);

        set.remove(12);
        System.out.println(set);
        System.out.println(set.contains(10));
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        set.clear();
        System.out.println(set);

    }
}
