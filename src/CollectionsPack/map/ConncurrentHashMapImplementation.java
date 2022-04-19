package CollectionsPack.map;

import java.util.concurrent.ConcurrentHashMap;

public class ConncurrentHashMapImplementation {
    public static void main(String[] args) {


                // create an instance of
                // ConcurrentHashMap
                ConcurrentHashMap<Integer, String> m
                        = new ConcurrentHashMap<>();

                // Insert mappings using
                // put method
                m.put(100, "Siddhant");
                m.put(101, "GK");
                m.put(102, "Mohit");

                m.putIfAbsent(101, "Hello");

                m.remove(101, "GK");

                // Now we can add Hello
                m.putIfAbsent(103, "Hello");

                // We cant replace Hello with For
                m.replace(101, "Hello", "For");
                System.out.println(m);


    }
}
