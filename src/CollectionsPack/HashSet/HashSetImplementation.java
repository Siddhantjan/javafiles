package CollectionsPack.HashSet;

import java.util.HashSet;

public class HashSetImplementation {
    public static void main(String[] args) {
        // default capacity 16 and load factor 0.75
        HashSet<Integer> hashSet = new HashSet<>(1);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(3); // already exits
        System.out.println(hashSet);//[1, 2, 3]

    }
}
